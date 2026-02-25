package Unit4;

//Program to demonstrate abstract class.
abstract class Bike1{  
    abstract void run();  
}  

class Honda extends Bike1{  
    @Override
    void run(){
      System.out.println("Running safely");
    }  
    public static void main(String args[]){  
      Bike1 obj = new Honda();  
      obj.run();  
      }  
}  

