package lotterygames; 
import java.util.Random; 
public class BlackRed extends GameBase implements IGame {
    @Override
    public void pick(){
        int userchoice = this.getUserInput("Red(1)/Black(2)?");
        Random r = new Random();
        int number = r.nextInt(100);
        if(userchoice!=1&&userchoice!=2){
            System.out.println("Wrong entry");
            return;
        }
        if(number>=50&&userchoice==1){ System.out.println("Correct (Red)"); } 
        else if(number<50&&userchoice==2){ System.out.println("Correct (Black)"); }
        else System.out.println("Incorrect ("+(number<50?"Black":"Red")+")");
    }
}
