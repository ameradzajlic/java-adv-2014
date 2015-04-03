package threadwaitexample; 
 
public class MyThread extends Thread { 
    @Override
    public void run(){
        synchronized(this){
                System.out.println("Thread " + Thread.currentThread().getId() + " will sleep some time");
                try { wait(); } catch (InterruptedException ex) { }          
                System.out.println(Thread.currentThread().getId() + " woke up");
                
                
                
        }
    }
}
