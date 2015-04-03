package snailrun;  
public class SnailRunnable implements Runnable {
    @Override
    public void run() {
        int totalTrip = 10;
        while(totalTrip-->0){
            try {
                Thread.sleep((long)(Math.random()*5000));
            } catch (InterruptedException ex) { }
            System.out.println(String.format("%"+Thread.currentThread().getId()+"s", totalTrip));
        }
        System.out.println("Snail #" + Thread.currentThread().getId()+" finished");
    }

}
