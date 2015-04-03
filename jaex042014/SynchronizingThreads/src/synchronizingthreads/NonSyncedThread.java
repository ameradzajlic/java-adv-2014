package synchronizingthreads;

public class NonSyncedThread implements Runnable {
    public void hold1(){
         synchronized(this){
            try { Thread.sleep(2000); } catch (InterruptedException ex) { }
            System.out.println("finished: " + Thread.currentThread().getId());
         }
    }
    public synchronized void hold(){
         try { Thread.sleep(2000); } catch (InterruptedException ex) { }
         System.out.println("finished: " + Thread.currentThread().getId());
    }
    @Override
    public void run() {
        hold();
    }

}
