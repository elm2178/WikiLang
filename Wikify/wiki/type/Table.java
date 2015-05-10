
import java.util.*;
import java.io.*;

import jxl.*;
import jxl.write.*;

import org.apache.poi.xwpf.usermodel.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Table {
	private String[][] table;
	private int rows, cols;
	private ArrayList<Table> tables;
	
	/**
	 * empty constructor
	 */
	public Table(){
		rows = 0;
		cols = 0;
		table = null;
	}
	
	public void setRowCol(int row, int col) {
        this.cols = col;
        this.rows = row;
        table = new String[row][col]; 
    }
	
	/**
	 * copies contents from input to table
	 * @param input: 2D String array, must have known size, individual entries can be null
	 */
	public Table(String[][] input){
		rows = input.length;
		cols = input[0].length;
		table = new String[rows][cols];
		for (int i=0; i<rows; i++){
			for (int j=0; j<cols; j++){
				table[i][j]=input[i][j];
			}
		}	
	}
	
	/**
	 * set content of cell(x,y) to new entry
	 * @param entry: a string you want to insert
	 * @param x: row index
	 * @param y: column index
	 * @return true if insertion is successful, false o/w
	 */
	public boolean insert(String entry, int x, int y){
		if (x>=0 && x<rows && y>=0 && y<cols){
			table[x][y] = entry;
			return true;
		}
		return false;
	}
	
	/**
	 * set content of cell(x,y) to empty string
	 * @param x row index
	 * @param y column index
	 * @return true if removal is successful, false o/w
	 */
	public boolean remove(int x, int y){
		if (x>=0 && x<rows && y>=0 && y<cols){
			table[x][y] = "";
			return true;
		}
		return false;
	}
	/**
	 * return the content of cell(x,y)
	 * @param x
	 * @param y
	 * @return null if coordinates are out of bounds, or entry is uninitialized.
	 */
	public String getEntry(int x, int y){
		if (x>=0 && x<rows && y>=0 && y<cols){
			return table[x][y];
		}
		else {return null;}
	}

	/**
	 * return the size in form of String
	 * @return e.g "3 rows 2 cols"
	 */
	public String getSize(){
		return rows + " rows " + cols + " cols ";
	}
	
	/**
	 * search keyword in the table, case insensitive
	 * @param keyword
	 * @return a list of coordinates that contain keyword
	 */
	public List<String> search(String keyword){
		List<String> results = new ArrayList<String>();
		for (int i=0; i<rows; i++){
			for (int j=0; j<cols; j++){
				if (table[i][j].toLowerCase().contains(keyword.toLowerCase())){
					results.add("("+i+","+j+")");
				}
			}
		}
		//System.out.println(results);
		return results;
	}
	
	/**
	 * print to the console in the form:
	 * row 0 xxx; xxx; ...
	 * row 1 xxx; xxx; ...
	 * ....
	 */
	public void print(){
		int rows = table.length;
		int cols = table[0].length;
		System.out.println("\nTable");
		for (int i=0; i<rows; i++){
			System.out.print("row " +i+" ");
			for (int j=0; j<cols; j++){
				System.out.print(table[i][j]+";");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void toExcel(String fileName){
		int offset = 0;
		fileName = fileName.split("\\.")[0]+".xls"; 
		WritableWorkbook workbook = null;
		WritableSheet sheet = null;
		try {
			File f = new File(fileName);
			if(f.isFile()) { 
				Workbook old = Workbook.getWorkbook(new File(fileName));
				workbook = Workbook.createWorkbook(new File(fileName), old);
				sheet = workbook.getSheet(0);
				offset = sheet.getRows() + 2;
			}
			else {
				workbook = Workbook.createWorkbook(new File(fileName));
				sheet = workbook.createSheet("sheet", 0); 
			}
			
		    for (int i=0; i<rows; i++){
				for (int j=0; j<cols; j++){
					Label label = new Label(j,i+offset,table[i][j]);
					sheet.addCell(label);
				}
			}
		    workbook.write();
		    workbook.close();
		    
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	    
	public void toWord(String fileName){
		fileName = fileName.split("\\.")[0] + ".docx";
		File f = new File(fileName);
		XWPFDocument doc = null;
		 
		if (f.isFile()) {
		    try {doc = new XWPFDocument(new FileInputStream(fileName));}
		    catch (Exception e) {e.printStackTrace();}
		}
		else {doc = new XWPFDocument();}
		
		XWPFParagraph p = doc.createParagraph();
		XWPFRun r = p.createRun();
		r.addBreak();
		XWPFTable t = doc.createTable(rows,cols);
		for (int i=0; i<rows; i++){
			for (int j=0; j<cols; j++){
				t.getRow(i).getCell(j).setText(table[i][j]);
			}
		}
		
		FileOutputStream out;
		try {
			out = new FileOutputStream(fileName);
			doc.write(out);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void url(String url){
		getTables(url);
	}
	public Table getTable(int i){
		if (i<0 || i>=tables.size()){
			System.out.println("index out of bound");
		    return null;
		}
		return this.tables.get(i);
	}
	
	private ArrayList<Table> getTables (String urlAddress){
   	 this.tables = new ArrayList<Table>();
   	 Document doc = null; 
	     
   	 //store html in doc
   	 try {
		    doc = Jsoup.connect(urlAddress).get();
   	 }
   	 catch (IOException e) {
	    	e.printStackTrace();
   	 }
	     
   	 //get only wikitables, not just any table
		 Elements wikiTables = doc.getElementsByClass("wikitable");
		 for (Element e : wikiTables){
			Table table = null;
			//first pass to get dimensions of table
			int rows = 0;
			int cols = 0;
			for (Element row : e.select("tr")){
				Elements tds = row.select("td");
				Elements ths = row.select("th");
				tds.addAll(ths);
			if (tds.size() == 0) continue; //this row has no columns
				cols = Math.max(cols, tds.size());
				rows++;
			}
			
			//construct new Table object 
			if (rows==0) continue;
			String[][] input = new String[rows][cols];
			table = new Table(input);
			
			//second pass to store content in table
			int i = 0;
			for (Element row : e.select("tr")){
				Elements tds = row.select("td");
				Elements ths = row.select("th");
				tds.addAll(ths);
				if (tds.size() == 0) continue;
				int j = 0;
				for (Element td : tds){
					table.insert(td.text(),i,j);
					j++;
				}
				i++;	
			}
			
			//add table to ArrayList
			tables.add(table);
		 }
		 return tables;
    }
	
	
}
