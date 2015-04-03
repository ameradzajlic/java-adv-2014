package closingthreads;
public class ClosingThreads {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.start();
        Thread.sleep(2000);
        System.out.println("Hey, wake up!");
        mt.stopThread();
    }
}
