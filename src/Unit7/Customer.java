package Unit7;

//Program to demonstrates inter-thread communication using the wait() and notify().
public class Customer {
    float amount=10000;  
  
    synchronized void withdraw(int wamount){  
        System.out.println("Going to withdraw...");  
        if(this.amount<wamount){  
            System.out.println("Less balance... Rs."+amount);  
        try{
            wait();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }  
        }
        if(this.amount>wamount){
            this.amount-=amount;  
            System.out.println("withdraw completed...Rs."+amount);  
        }
    }
    synchronized void deposit(float damount){  
        System.out.println("going to deposit...");  
        this.amount+=damount;  
        System.out.println("deposit completed... Rs."+damount);  
        notify();  
    }     
    public static void main(String args[]){
        Customer c=new Customer();  
        new Thread(){  
            public void run(){
            c.withdraw(15000);}
        }.start();  
        new Thread(){  
            public void run(){
            c.deposit(10000);}  
        }.start();  
    }
}
