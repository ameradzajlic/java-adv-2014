package hitme; 
public class HitMe {
    public static void main(String[] args) throws InterruptedException {
        UI ui = new UI();
        Graphic g = new Graphic();
        Round r = new Round(UI.getUserFloat("Enter tank position:").intValue(),g); 
    }
}
