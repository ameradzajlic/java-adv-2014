package simplerunnable;
public class SimpleRunnable {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        for(int i=0;i<10;i++){
            new Thread(myThread).start();
        }
    }
}
