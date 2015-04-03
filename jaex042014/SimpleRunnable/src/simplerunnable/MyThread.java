package simplerunnable;   
public class MyThread implements Runnable {
    public MyThread(){
        System.out.println("New thread is created. Or not?");
    }
    @Override
    public void run() { 
            System.out.println("Hello from thread " + Thread.currentThread().getId());
            System.out.println("My name is " + Thread.currentThread().getName());
            System.out.println("My state is " + Thread.currentThread().getState());
            System.out.println("My priority is " + Thread.currentThread().getPriority());
    } 
}
