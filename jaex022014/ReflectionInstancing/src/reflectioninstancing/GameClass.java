package reflectioninstancing;
public class GameClass {
    public GameClass(){
        System.out.println("Game class is instantiated");
    }
    public void StartGame(){
        System.out.println("Game is started");
    }
    public void hit(int hit_strength){
        System.out.println("Hit performed with strength " + hit_strength);
    }
}
