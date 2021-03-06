package wiki.type;

public class HtmlParser{
    private String[] page;
    private int x;
    private int y;
    private String mode;
    private boolean skipContents;
    private boolean getLink;
    private String[] output;
    private String[][] table;
    private int index;
    private int columns;
    private int rows;
    private int indent;
    private int[] olCount;

    public HtmlParser(String[] page){
        this.page = page;
        getLink = false;
        skipContents = true;
        x = 0; //array index
        y = 0; //String index
    }

    public String[] returnInfobox(){
        x=0;y=0;
        String special = "infobox";
        boolean subtitle=false;
        boolean title=false;
        int tableCounter=0;
        String[] output = new String[1000];
        int parCount=0;
        String tag="";
        String tempout="";
        while(!end()){
    
            goback1:
            if(show(1).equals("<")){
                tag = tagger();
                if(tag.length()>5){
                    if(tag.substring(0,5).equals("table")&&tag.contains(special)){
                        tableCounter++;
                        special="asdkfjalsdjv";
                        while(true){
                            while(show(1).equals("<")){
                                tag = tagger(); //gets tag. position of vector is now right after tag
                                if(tag.length()>5){
                                    if(tag.substring(0,5).equals("table")){
                                        tableCounter++;
                                    }
                                }
                                if(tag.length()>3){
                                    if(tag.substring(0,2).equals("th")){
                                        title=true;
                                    }
                                }                            
                                if(tag.length()>3){
                                    if(tag.substring(0,2).equals("td")){
                                        subtitle=true;
                                    }
                                }
    
                                if(tag.equals("/table")){ //if endtag
                                    tableCounter--;
                                    if(tableCounter==0){
                                        System.out.println(tempout);
                                        output[parCount++] = tempout;
                                        tempout = "";
                                        break goback1;
                                    }
                                }
                            }
                            String temp="";
                            if(title){
                                tempout+="\n";
                                title=false;
                            }
                            if(subtitle){
                                tempout+="\n\t";
                                subtitle=false;
                            }
    
                            temp += getString(ahead("<"));
                            if(tempout!=null)
                                tempout+=temp+" ";
                        }
                    }
                }
            }
            else{
                skip(ahead("<"));
            }
        }
        String[] temp = new String[parCount]; //Get rid off nulls
        for(int x=0; x<3; x++)
        temp[x] = output[x];
        output = temp;
        return output;        
    }   

    public String[] getTables(){
        x=0;
        y=0;
        String special = "infobox";
        boolean subtitle=false;
        boolean title=false;
        int tableCounter=0;
        String[] output = new String[1000];
        int parCount=0;
        String tag="";
        String tempout="";
        
        while(!end()){
    
            goback1:
            if(show(1).equals("<")){
                tag = tagger();
            if(tag.length()>5){
                if(tag.substring(0,5).equals("table")&&tag.contains(special)){
                    tableCounter++;
                    special="asdkfjalsdjv";
                    while(true){
                        while(show(1).equals("<")){
                            tag = tagger(); //gets tag. position of vector is now right after tag
                            if(tag.length()>5){
                                if(tag.substring(0,5).equals("table")){
                                    tableCounter++;
                        }
                    }
                    if(tag.length()>3){
                        if(tag.substring(0,2).equals("th")){
                            title=true;
                        }
                    }                            
                    if(tag.length()>3){
                        if(tag.substring(0,2).equals("td")){                                
                            subtitle=true;
                        }
                    }
    
                    if(tag.equals("/table")){ //if endtag
                        tableCounter--;
                        if(tableCounter==0){
                            System.out.println(tempout);
                                output[parCount++] = tempout;
                                tempout = "";
                                break goback1;
                        }
                    }
                }
                String temp="";
                if(title){
                    tempout+="\n";
                    title=false;
                }
                if(subtitle){
                    tempout+="\n\t";
                    subtitle=false;
                }
                
                temp += getString(ahead("<"));
                if(tempout!=null)
                    tempout+=temp+" ";
                }
                }
            }
                
             }
             else{
             skip(ahead("<"));
             }
        }
        return output;
    }                           

    // public void getTables(){
    //     x=0;
    //     y=0;
    //     String[] output = new String[1000];
    //     int parCount=0;
    //     String tag="";
    //     String tempout="";
    //     while(!end()){

    //         goback1:
    //         if(show(1).equals("<")){
    //             tag = tagger();
    //             if(tag.length()>5){
    //                 if(tag.substring(0,5).equals("table")){
    //                     while(true){
    //                     while(show(1).equals("<")){
    //                         tag = tagger(); //gets tag. position of vector is now right after tag
    //                         if(tag.equals("/table")){ //if endtag
    //                             System.out.println(tempout);
    //                             output[parCount++] = tempout;
    //                             tempout = "";
    //                             break goback1;
    //                         }
    //                     }
    //                     tempout += getString(ahead("<"))+" ";
    //                 }
    //                 }
    //             }
    //          }
    //          else{
    //              skip(ahead("<"));
    //          }
    //     }
    // }


    public String[] getParagraphs(){ //Returns an array with all paragraphs on a Wikipage
    	x=0;
    	y=0;

    	output = new String[1000];
    	index = 0;
    	mode = "par";
    	skip(ahead("<h1>"));
    	rec(tagger(), mode);

        //remove nulls
        int counter = 0;
        for(int x=0; output[x]!=null; x++)
            counter++;
        
        String[] temp = new String[counter];
        for(int x=0; x<counter; x++)
            temp[x] = output[x];

    	return temp;
    }

    public String[] getHeaders(){
        x=0;
        y=0;

        output = new String[1000];
        index = 0;
        mode = "par";
        skip(ahead("<h1>"));
        rec(tagger(), mode);

        //remove nulls
        String[] temp = new String[1000];
        //Remove nulls and sort out links
        int counter = 0;
        for(int x=0; output[x]!=null; x++){
            if(output[x].contains("<h1>")||output[x].contains("<h2>")||output[x].contains("<h3>"))
                temp[counter++] = output[x];
        }
        
        String[] output = new String[counter];
        for(int x=0; x<counter; x++)
            output[x] = temp[x];

        return output;
    }

    public String[] getLinks(){
        x=0;
        y=0;

        output = new String[1000];
        index = 0;
        getLink = true;
        mode = "par";
        skip(ahead("<h1>"));
        rec(tagger(), mode);

        String[] temp = new String[1000];
        //Remove nulls and sort out links
        int counter = 0;
        for(int x=0; output[x]!=null; x++){
            if(output[x].contains("__LINK__"))
                temp[counter++] = output[x].substring(8);
        }
        
        String[] output = new String[counter];
        for(int x=0; x<counter; x++)
            output[x] = temp[x];

        return output;
    }

    private String rec(String tag, String req){
        //System.out.println("rec("+tag+", "+req+")");
        //If getLink=true Wikilinks are stored to output
        if(getLink && tag.substring(0,1).equals("a")){
            if(tag.contains("href=\"/wiki/")){
                String temp = tag.substring(tag.indexOf("\"")+1);
                temp = temp.substring(0, temp.indexOf("\""));
                if(!temp.contains(":"))
                    output[index++] = "__LINK__http://wikipedia.org"+temp;
            }
        }
        //"par" mode is the only mode implemented for rec function so far
    	if(req.equals(mode)){
            //ends parsing after main content of page
            if(tag.equals("div class=\"printfooter\"")){
                ;
            }
            else if(mode.equals("par")){
                //Adds p tags to the output
                if(tag.equals("p")){
                    output[index++] = getString(ahead("<")) + rec(tagger(), "p");
                    skip(ahead("<"));
                    rec(tagger(), "par");
                }
                //Adds h1 and h2 headers to output 
                else if(tag.length()>1 && (tag.substring(0,2).equals("h1")||tag.substring(0,2).equals("h2")||tag.substring(0,2).equals("h3"))){
                    String temp = "<"+tag.substring(0,2)+">" + getString(ahead("<")) + rec(tagger(), tag.substring(0,2)) + "</"+tag.substring(0,2)+">";
                    
                    //Skip Table of Contents if requested
                    if(skipContents && temp.equals("<h2>Contents</h2>"))
                        skip(ahead("<p>"));
                    //Skips References
                    else if(temp.equals("<h2>References</h2>"))
                        skip(ahead("<h2>"));
                    else{
                        output[index++] = temp;
                        skip(ahead("<"));
                    }
                    rec(tagger(), "par");
                }
                //Includes ordered and unordered lists in output
                else if(tag.length()>1 && (tag.substring(0,2).equals("ul")||tag.substring(0,2).equals("ol"))){
                    skip(ahead("<"));
                    indent = 0;
                    olCount = new int[]{1,1,1,1,1,1,1,1,1,1};
                    rec(tagger(), tag.substring(0,2));
                    rec(tagger(), "par");
                }
                //Skips over table content
                else if(tag.length()>4 && tag.substring(0,5).equals("table")){
                    skipper("</table>");
                    skip(ahead("<"));
                    rec(tagger(), "par");
                }
                else if(!end()){
                    skip(ahead("<"));
                    rec(tagger(), "par");
                }
    		}
    		else if(!end()){
    			skip(ahead("<"));
    			rec(tagger(), mode);
    		}
    	}
    	else{
            //skips sup tags
    		if(tag.length()>2 && tag.substring(0,3).equals("sup")){
    			skipper("</sup>");
    			return getString(ahead("<")) + rec(tagger(), req);
    		}
            //handles a tags
    		else if(tag.length()>0 && tag.substring(0,1).equals("a")){
                return getString(ahead("<")) + rec(tagger(), "a") + getString(ahead("<")) + rec(tagger(), req);
    		}
            //handles bold and italic tags
    		else if(tag.length()==1 && (tag.substring(0,1).equals("i")||tag.substring(0,1).equals("b"))){ //handles italic and bold
    			//return "<"+tag.substring(0,1)+">" + getString(ahead("<")) + rec(tagger(), tag.substring(0,1)) + "</"+tag.substring(0,1)+">" + getString(ahead("<")) + rec(tagger(), req);
                return getString(ahead("<")) + rec(tagger(), tag.substring(0,1)) + getString(ahead("<")) + rec(tagger(), req);
    		}
            //handles h1 and h2 headlines
    		else if(tag.length()>23 && tag.substring(0,24).equals("span class=\"mw-headline\"") && (req.equals("h1")||req.equals("h2")||req.equals("h3"))){
    			String temp = getString(ahead("<"));
                skip(ahead("</"+req));
                return temp + rec(tagger(), req);
    		}
            //Handles list entries
            else if(tag.length()>1 && tag.substring(0,2).equals("li") && (req.equals("ul")||req.equals("ol"))){
            	if(req.equals("ul")){
            		output[index++] = new String(new char[indent]).replace("\0", "\t") + "- " + getString(ahead("<")) + rec(tagger(), "li");
                }
            	else{
            		output[index++] = new String(new char[indent]).replace("\0", "\t") +" "+ Integer.toString(olCount[indent]++) + ". " + getString(ahead("<")) + rec(tagger(), "li");
                }

            	skip(ahead("<"));
            	rec(tagger(), req);
            }
            //Handles Lists within lists
            else if(req.equals("li") && tag.length()>1 && (tag.substring(0,2).equals("ul")||tag.substring(0,2).equals("ol"))){
                if(tag.equals("ul")){
                    indent++;
                    rec(tagger(), tag.substring(0,2));
                    indent--;
                }
                else{
                    indent++;
                    rec(tagger(), tag.substring(0,2));
                    olCount[indent] = 1;
                    indent--;
                }   
            }
            //handles end tags
    		else if(tag.length()>1 && tag.substring(0,1).equals("/")){
    			if(tag.equals("/"+req)){
    				return "";
    			}
    			else if(req.equals(mode)){
    				skip(ahead("<"));
    				rec(tagger(), mode);		
    			}
    			else{
    				return getString(ahead("<")) + rec(tagger(), req);
    			}
    		}
    		else if(tag.equals("/html")||tag.equals("/body")){
    			return "";
    		}
            else{
                skip(ahead("<"));
                return rec(tagger(), req);
            }
    	}
    	return "";
    }

    private String tagger(){ //finds and returns tag
        String tag = "";
        next();
        int x = ahead(">");
        tag = getString(x);
        if(tag.contains("<"))
            tag = tag.substring(tag.indexOf("<")+1);
        next();
        //System.out.println("TAG: "+tag);
        return tag;
    }

    private void skipper(String s){ //Skips until after first occurence of s
        skip(ahead(s)+s.length());
    }

    private String get(){ //returns a String of size 1. Position vector moves on
        String out = page[x].substring(y,y+1);
        next();
        return out;
    }

    private String getString(int size){ //returns a "size" long String. Position vector moves on
        String out = "";
        
        if(size == -1)
        	return "";

        for(int i=0; i<size; i++)
            out += get();
        //System.out.println("STRING: "+out);
        return out;
    }

    private String show(int size){ //returns the next "size" number of chars
        String out = getString(size);
        reverse(size);
        return out;
    }

    //Now returns -1 if it fails
    private int ahead(String s){ //Looks ahead for a certain String, returns the distance to the first char of String
        int a=x;
        int b=y;
        int counter=1;
        String temp = "";

        if(s.equals("<")&&show(1).equals("<"))
        	return 0;

        for(int i=0; i<s.length(); i++){
        	
            if(b<page[a].length()-1)
                b++;
            else if(a!=page.length-1){
                a++;
                while(page[a].equals(""))
                    a++;
                b=0;
            }
            else{
                //System.err.println("End of HTML reached!");
                return -1;
            }
            temp+=page[a].substring(b,b+1);
        }

        while(!s.equals(temp)){
            counter++;

            if(b<page[a].length()-1)
                b++;
            else if(a!=page.length-1){
                a++;
                while(page[a].equals(""))
                    a++;
                b=0;
            }
            else{
                //System.err.println("End of HTML reached!");
                return -1;
            }

            temp = temp.substring(1,s.length()) + page[a].substring(b,b+1);
        }

        return counter;
    }

    private void skip(int a){	//skips "a" chars
        for(int i=0; i<a; i++)
            next();
    }

    private void next(){	//changes position vector to point at next char
        if(y<page[x].length()-1)
            y++;
        else if(x!=page.length-1&&page[x+1]!=null){
            x++;
            while(page[x].equals(""))
                x++;
            //System.out.println("NEWLINE: "+page[x]);
            y=0;
        }
        else{
            //System.out.println("End of array reached!");
            x = page.length-1;
            y = page[x].length()-1;
        }
    }

    private void reverse(int a){	//changes vector to point at prior char
        for(int i=0; i<a; i++){
            if(y!=0){
                y--;
            }
            else if(x!=0){
                x--;
                y = page[x].length()-1;
            }
        }
    }

    private boolean end(){
        return((x == page.length-1)&&(y == page[x].length()-1));
    }
}
