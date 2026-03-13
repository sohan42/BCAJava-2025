package Unit7;

//Simple program to demonstrate Thread.
public class Thread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
    }
    public static void main (String args[]){
        Thread1 thread = new Thread1();
        thread.start(); // Invokes the run() method in a new thread.
    }
}
