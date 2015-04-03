package observer;
public interface IDistributer {
    void addSubscriber(ISubscriber s); 
    void cancelSubscriber(ISubscriber s); 
    void sendUpdate(String msg);
}
