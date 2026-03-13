
package Unit7;

//Program that demonstrates a classic deadlock situation. Two threads attempt to lock two resources in a different order.
public class DeadlockExample {
    public static void main(String[] args) {
        final String r1 = "Resource1";
        final String r2 = "Resource2";
        // Thread 1 tries to lock resource1 then resource2
        Thread thread1 = new Thread() {
            public void run() {
                synchronized(r1){
                    System.out.println("Thread 1: Locked resource 1");
                    // Simulate some work with resource1
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                    synchronized(r2){
                        System.out.println("Thread 1: Locked resource 2");
                    }
                }
            }
        };
        
        // Thread 2 tries to lock resource2 then resource1
        Thread thread2 = new Thread() {
            public void run() {
                synchronized(r2){
                    System.out.println("Thread 2: Locked resource 2");
                    // Simulate some work with resource2
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                    synchronized(r1){
                        System.out.println("Thread 2: Locked resource 1");
                    }
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}

