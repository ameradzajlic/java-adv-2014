package lotterygames;
import java.util.Random;
public class Gamble extends GameBase implements IGame {
    @Override
    public void pick() {
        Random r = new Random();
        Integer number = r.nextInt(100);
        System.out.println("Number is " + number);
        int userchoice = this.getUserInput("Greater(1)/Smaller(2)/Equals(3): ");
        int newnumber = r.nextInt(100);
        if(userchoice!=1&&userchoice!=2&&userchoice!=3){
            System.out.println("Wrong entry");
            return;
        }
        if(userchoice==1&&newnumber>number) System.out.println("Correct ("+newnumber+")");
        else if(userchoice==2&&newnumber<number) System.out.println("Correct ("+newnumber+")");
        else if(userchoice==3&&newnumber==number) System.out.println("Correct ("+newnumber+")");
        else System.out.println("Incorrect ("+newnumber+")");
    };
}
