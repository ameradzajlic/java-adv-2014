package hitme; 
import java.util.HashMap;
import java.util.Scanner; 
public class UI {
    public static Float getUserFloat(String message){
        Scanner scanner = new Scanner(System.in);
        while(true){
        try { 
                System.out.print(message);
                Float userFloat = scanner.nextFloat(); 
                return userFloat;
            } catch(Exception ex){
                scanner.next();
            }
        }
    } 
    public static void displayMessage(String message){
        System.out.println(message);
    }
    public static void displayPositions(int user, int computer){
        System.out.println("User x is " + user + ", computer x is " + computer);
    }  
    public static HashMap<String,Float> getCannonPos(){
        HashMap<String,Float> res = new HashMap<>();
        res.put("angle", getUserFloat("Enter angle: "));
        res.put("power", getUserFloat("Enter power: "));
        return res;
    }
}
