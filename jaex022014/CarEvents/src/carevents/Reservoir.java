package carevents;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
public class Reservoir {
    private int currentState;
    private int reserveLimit;
    private List<ReservoirListener> listeners;
    public Reservoir(){ 
        currentState = 100;
        reserveLimit = 10;
        listeners = new ArrayList<>(); 
    }
    public void addEventListener(ReservoirListener lis){ listeners.add(lis); }
    public void removeEventListener(ReservoirListener lis){ listeners.remove(lis); }
    public void distributeEvent(){
        for(ReservoirListener lis : listeners){
            lis.reserveReached(new EventObject(this));
        }
    }
    public void consumeFuel(){
        System.out.println("Fuel consumed. " + currentState + " liters remaining");
        if(--currentState<reserveLimit){
            distributeEvent();
        }
    }
}
