package closingthreads; 
public class MyThread extends Thread {
    boolean active = false;
    public void cleanUp(){
        System.out.println("I will clean up everything now");
    }
    public void stopThread(){
        active = false;
    }
    @Override
    public void run(){ 
        active = true;
        System.out.println("I am going to sleep 10 seconds");
        try {
            for(int i=0;i<10;i++){
                if(!active) { cleanUp(); return; }
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Hey!"); 
        } 
        System.out.println("Ok, ok..I am awake"); 
    }
} 