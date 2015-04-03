package threadwaitexample; 
import java.util.Scanner; 
public class ThreadWaitExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.start();
        MyThread mt1 = new MyThread();
        mt1.start();
        Thread.sleep(100);
        mainLoop:
        while(true){
            Thread.sleep(100);
            System.out.print("(Thread to wake 1,2): ");
            Scanner scanner = new Scanner(System.in);
            int threadId = scanner.nextInt();
            switch(threadId){ 
                case 1: 
                    synchronized(mt) { mt.notify(); }; 
                    if(!mt1.isAlive()) break mainLoop;
                    break; 
                case 2: 
                    synchronized(mt1) { mt1.notify(); }; 
                    if(!mt.isAlive()) break mainLoop;
                    break;
            }
        } 
    }
}
