package synchronizingthreads;
public class SynchronizingThreads {
    public static void main(String[] args) {
        NonSyncedThread myThread = new NonSyncedThread();
        for(int i=0;i<10;i++){
            Thread t = new Thread(myThread);
            t.start();
        }
    }
}
