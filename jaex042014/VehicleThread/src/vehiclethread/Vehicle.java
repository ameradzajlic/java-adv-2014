package vehiclethread; 
public class Vehicle extends Thread {
    String type;
    float fuel = 10;
    float consumption;
    int speed;
    public Vehicle(String type){
        this.type = type;
        if(type.equals("truck")) {
            this.consumption = .4f;
            this.speed = 1500;
        } else {
            this.consumption = .2f;
            this.speed = 1000;
        }
    }
    @Override
    public void run(){
        while(true){
            try { Thread.sleep(speed); } catch (InterruptedException ex) { }
            if(fuel<=0){
                System.out.println("Refilling " + type + " tank...");
                try { Thread.sleep(4000); } catch (InterruptedException ex) { }
                fuel=10;
            } else {
                System.out.printf(type + " is running (fuel %.2f)\n",fuel);
                fuel-=consumption;
            }
        }
    }
}
