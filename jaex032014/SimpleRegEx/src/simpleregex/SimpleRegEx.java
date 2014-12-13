package simpleregex;
import java.util.regex.*;
public class SimpleRegEx {
    public static void main(String[] args) { 
        Pattern p = Pattern.compile("bong"); 
        Matcher m = p.matcher("bing bang bong bung"); 
        System.out.println("String contains word: " + m.find()); 
        System.out.println(m.replaceAll("HELLO")); 
    }
}
