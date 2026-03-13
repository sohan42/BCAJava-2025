package Unit7;

//Program to run two threads by extending Thread class.
public class MyThread extends Thread{
    private String tName;
    MyThread(String name){
        tName = name;
        System.out.println("Creating "+tName);
    }
    @Override
    public void run(){    
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
        MyThread R1 = new MyThread("Thread-1");
        R1.start();
        MyThread R2 = new MyThread("Thread-2");
        R2.start();
    }
}
