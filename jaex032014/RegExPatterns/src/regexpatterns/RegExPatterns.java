package regexpatterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExPatterns {
    public static void main(String[] args) {
        System.out.println("Match if string contains characters b, i or f");
        Pattern p = Pattern.compile("[bif]"); 
        Matcher matcher = p.matcher("bing bang bong bung");
        System.out.println(matcher.find());
        
        System.out.println("Match if string contains characters from d to h");
        p = Pattern.compile("[d-h]"); 
        matcher = p.matcher("hello world");
        System.out.println(matcher.find());
        
        System.out.println("Match if string contains characters from a to c and from e to g");
        p = Pattern.compile("[a-ce-g]"); 
        matcher = p.matcher("I will be matched true");
        System.out.println(matcher.find());
        
        System.out.println("Match if string contains numbers from 0 to 9");
        p = Pattern.compile("\\d"); 
        matcher = p.matcher("I don't have any numbers");
        System.out.println(matcher.find());
        
    }
}
