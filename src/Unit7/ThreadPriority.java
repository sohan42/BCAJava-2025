
package Unit7;

//Program to demonstrate thred priorities.
public class ThreadPriority implements Runnable{
    private String name;
    ThreadPriority(String name) {
        this.name = name;
    }
    @Override
    public void run() {
      for (int i = 1; i <= 5; i++) {
            System.out.println(name + " iteration " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
        }
        System.out.println(name + " finishing execution.");
    }
    public static void main(String args[]){
        Thread thread1 = new Thread(new ThreadPriority("HighPriorityThread"));
        Thread thread2 = new Thread(new ThreadPriority("LowPriorityThread"));
        thread1.setPriority(Thread.MAX_PRIORITY);  // 10
        thread2.setPriority(Thread.MIN_PRIORITY);     // 1
        thread1.start();
        thread2.start();
    }
}
