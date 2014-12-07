package lotterygames; 
import java.util.Scanner; 
public class LotteryGames {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.print("Choose game (Gamble/BlackRed) :");
        Scanner scanner = new Scanner(System.in);
        String game_name = scanner.nextLine();
        IGame game = (IGame)Class.forName("lotterygames."+game_name).newInstance();
        while(true) {
            game.pick();
        }
    }
}
