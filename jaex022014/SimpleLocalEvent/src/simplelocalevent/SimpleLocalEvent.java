package simplelocalevent;
public class SimpleLocalEvent { 
    public static void main(String[] args) {
        Reservour res = new Reservour();
        for(int i=0;i<100;i++){
            res.getFuel();
        }
    }
}
