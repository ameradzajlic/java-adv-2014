package observer;
import java.util.ArrayList;
public class Distributer implements IDistributer {
ArrayList<ISubscriber> subscribers;
  
    public Distributer() 
    { 
        this.subscribers = new ArrayList<>(); 
    }
 
    public void addSubscriber(ISubscriber s) { 
        this.subscribers.add(s); 
    }
 
    public void cancelSubscriber(ISubscriber s) { 
        this.subscribers.remove(s); 
    }
 
    public void sendUpdate(String myUpdate) { 
        for(int i=0;i<subscribers.size();i++) 
            subscribers.get(i).update(myUpdate); 
    } 
}