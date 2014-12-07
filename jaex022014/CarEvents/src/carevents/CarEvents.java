package carevents;
import java.util.EventObject;
public class CarEvents {
    public static void main(String[] args) throws InterruptedException {
        Reservoir res = new Reservoir();
        res.addEventListener(new ReservoirListener() {
            @Override
            public void reserveReached(EventObject evt) {
                     System.out.println("No more fuel in car. Please refill!");
            }
        });
        for(int i=0;i<100;i++){
            res.consumeFuel();
            Thread.sleep(100);
        }
    }
}
