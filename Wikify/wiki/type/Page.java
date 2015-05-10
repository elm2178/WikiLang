package wiki.type;
import java.net.*;
import java.io.*;
import java.util.Arrays;

import org.apache.poi.xwpf.usermodel.*;

public class Page{
    private String url;
    private String[] html;
    private HtmlParser parser;
    
    public Page() {
        this.url = "";
        this.parser = null;
    }

    public Page(String url) {
        this.url = url;
        html = getHtml();
        this.parser = new HtmlParser(html);
    }

    public void url(String url) {
        this.url = url;
        html = getHtml();
        this.parser = new HtmlParser(html);
    }

    public String getUrl() {
        return url;
    }

    public String[] getHtml() {
        try {
            String line;
            String[] buffer = new String[1000];
            URL myURL = new URL(this.url);
            InputStream is = myURL.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int i = 0;
            while((line = br.readLine()) != null) {

                if(i == buffer.length)
                    buffer = Arrays.copyOf(buffer, buffer.length *2);

                buffer[i] = line;
                i++;
            }
            buffer = Arrays.copyOf(buffer, i);
            return buffer;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String[] getParagraphs() {
        return parser.getParagraphs();
    }

    public String[] getTables(){
        return parser.getTables();
    }

    public String[] getLinks(){
        return parser.getLinks();
    }

    public String[] getHeaders(){
        return parser.getHeaders();
    }
	
    public String[] returnInfobox(){
	System.out.println("Looking for tables!!!");
	   return parser.returnInfobox();
    }

    //asks user for input --> will automatically search wiki for search terms
    public void urlPrompt(){
	try{
	System.out.println("Please input your search term(s): ");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s = br.readLine();
	s = s.replace(",","");
	s = s.replace(";","");
	s = s.replace(" ","_");
	this.url = "http://www.wikipedia.org/wiki/"+s;
	this.html = getHtml();
        this.parser = new HtmlParser(html);
	} catch (Exception e){
            System.out.println("No Internet Connection!");
	}
    }
    
    public void toWord(String fileName){
        String[] paragraphs = this.getParagraphs();
	fileName = fileName.split("\\.")[0] + ".docx";
	File f = new File(fileName);
	XWPFDocument doc = null;
	 
	if (f.isFile()) {
	    try {doc = new XWPFDocument(new FileInputStream(fileName));}
	    catch (Exception e) {e.printStackTrace();}
	}
	else {doc = new XWPFDocument();}
	 
	for (int i=0; i< paragraphs.length; i++){
	    XWPFParagraph p = doc.createParagraph();
	    XWPFRun r = p.createRun();
	    if (paragraphs[i].contains("<h")){
	    	paragraphs[i] = paragraphs[i].replaceAll("<h.*?>", "");
	    	paragraphs[i] = paragraphs[i].replaceAll("</h.*?>", "");
	    	r.setBold(true);
	   
	    }
	    r.setText(paragraphs[i]);
	    r.addBreak();
	}
	 
	FileOutputStream out;
	try {
	    out = new FileOutputStream(fileName);
	    doc.write(out);
	    out.close();
	}  catch (Exception e) {
	    e.printStackTrace();
	}
    }


    //DOES NOT WORK
    // public int getType() {
    //     return DataType.PAGE;
    // }

}
