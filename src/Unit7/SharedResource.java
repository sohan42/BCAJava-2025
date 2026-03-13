package Unit7;

public class SharedResource {
    private int count = 0;
    // Synchronized method to prevent race conditions
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " - Count: " + count);
 }
    public static void main(String args[]){
        SharedResource resource = new SharedResource();
        // Creating multiple threads to modify the shared resource
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.increment();
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.increment();
            }
        }, "Thread-2");
        t1.start();
        t2.start();
    }
}
