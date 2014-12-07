package lotterygames; 
import java.util.Scanner; 
public class GameBase {
    public int getUserInput(String message){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.err.print(message);
            try {
                return scanner.nextInt();
            } catch(Exception ex) { ex.printStackTrace(); }
        } 
    }
}
