import java.util.HashMap;

public class WikiTypeChecker {

    /* List of Different Types */
    public static final int UNDEFINED = -1;
    public static final int NUM = 0;
    public static final int STR = 1;
    public static final int PAGE= 2;
    public static final int TABLE= 3;
    public static final int IMAGE= 4;
    /**************************/

    public static HashMap<String, Integer> idTable = new HashMap<String, Integer>();

    public static HashMap<String, Integer[]> func_table;

    public WikiTypeChecker() {

    }


}
