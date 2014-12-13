package regexphonenovalidate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExPhoneNoValidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter phone number: ");
            String phone = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[0-9]{3}/[0-9]{3}-[0-9]{4}$");
            Matcher matcher = pattern.matcher(phone);
            if(matcher.find()){
                System.out.println("Phone is valid");
                break;
            }
        }
    }
}
