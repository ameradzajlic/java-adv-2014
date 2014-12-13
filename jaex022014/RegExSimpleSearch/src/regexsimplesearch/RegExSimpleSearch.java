package regexsimplesearch; 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern; 
public class RegExSimpleSearch {
    public static void main(String[] args) {
        List<String> sentences = new ArrayList<>();
        sentences.add("A tank is a large type of armoured fighting vehicle with tracks, designed for front-line combat.");
        sentences.add("Modern tanks are strong mobile land weapons platforms, mounting a large-calibre cannon in a rotating gun turret.");
        sentences.add("They combine this with heavy vehicle armour providing protection for the crew of the weapon and operational mobility, which allows them to position on the battlefield in advantageous locations.");
        sentences.add("These features enable the tank to have enormous capability to perform well in a tactical situation: the combination of strong weapons fire from their tank gun and their ability to resist enemy fire means the tank can take hold of and control an area of the battle and prevent other enemy vehicles from advancing, for example.");
        
        System.out.print("Enter word: ");
        Pattern pattern = Pattern.compile(new Scanner(System.in).nextLine());
        for(String s : sentences){
           if(pattern.matcher(s).find()){
               System.out.println(s);
           }
        }
    }
}
