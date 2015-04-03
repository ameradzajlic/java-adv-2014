package observer; 
public class Subscriber implements ISubscriber { 
    public String name; 
    public Subscriber(String name) 
    {   
        this.name = name; 
    } 
    public void update(String args) { 
        System.out.println("Updated object " + this.name + " args " + args); 
    } 
}
