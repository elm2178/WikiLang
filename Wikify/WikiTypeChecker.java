import java.util.HashMap;

/* Very likely this will only work for functions defined before they are called */
public class WikiTypeChecker {

    /* List of Different Types */
    public static final int UNDEFINED = -1;
    public static final int NUM = 0;
    public static final int STR = 1;
    public static final int PAGE= 2;
    public static final int TABLE= 3;
    public static final int IMAGE= 4;

    /*Cont and Term are used in Integer[] 
     * to keep track of overloaded functions
     */
    public static final int CONT = -2;
    public static final int TERM = -3;
    /**************************/

    public static HashMap<String, Integer> idTable = new HashMap<String, Integer>();
    /*
     * Integer[] is used for multiple arguments per function
     * TERM seperates overloaded function names
     */
    public static HashMap<String, Integer[]> func_table = new HashMap<String, Integer[]>();

    public WikiTypeChecker() {
        /* Functions for Page Class */
        func_table.put("url", new Integer[]{STR,TERM});
        func_table.put("getUrl", new Integer[]{TERM});
        func_table.put("getHtml", new Integer[]{TERM});
        func_table.put("getHtml", new Integer[]{TERM});
        func_table.put("getParagraphs", new Integer[]{TERM});
        func_table.put("toWord", new Integer[]{STR, TERM});
        func_table.put("getInfobox", new Integer[]{TERM});
        func_table.put("getTables", new Integer[]{TERM});
        func_table.put("urlPrompt", new Integer[]{TERM});
        func_table.put("getType", new Integer[]{TERM});
    }
}
