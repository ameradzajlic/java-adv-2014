package snailrun;
public class SnailRun {
    public static void main(String[] args) {
        SnailRunnable sr = new SnailRunnable();
        for(int i=0;i<20;i++){
            new Thread(sr).start();
        }
    }
}
