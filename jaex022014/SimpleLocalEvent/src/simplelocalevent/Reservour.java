package simplelocalevent;
public class Reservour {
    private int reserveLimit = 10;
    private int totalAmount = 100;
    private void reserveIndicator(){
        System.out.println("Hey, I am on reserve! Please refill me!");
    }
    public void getFuel(){
        if(--totalAmount<=reserveLimit){
            reserveIndicator();
        }
        System.out.println(totalAmount);
    }
}
