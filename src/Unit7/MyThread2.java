package Unit7;

public class MyThread2 implements Runnable{
    private String tName;
    MyThread2(String name){
        tName = name;
        System.out.println("Creating "+tName);
    }
    @Override
    public void run() {
        System.out.println("Running "+tName);
         try{
            for(int i=1;i<4;i++){
                System.out.println(tName+","+"Iteration: "+i);
                Thread.sleep(50);
            }
        }
         catch(InterruptedException e){
            System.out.println(tName+"interrupted");
         }
       System.out.println(tName+" exiting"); 
    }
    public static void main(String args[]){
        MyThread2 r1 = new MyThread2("Thread-1");
        Thread t1 = new Thread(r1);
        t1.start();
        MyThread2 r2 = new MyThread2("Thread-2");
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
