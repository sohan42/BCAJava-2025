package Unit4;

/*Program to demonstrate multiple inheritance by implementing 
Printable and Showable interfaces using Display class*/
interface Printable{  
  void print();  
}  
interface Showable{  
  void show();  
}  
class Display implements Printable,Showable{  
  @Override
  public void print(){
    System.out.println("Hello");
  }  
  @Override
  public void show(){
    System.out.println("Welcome");
  }  
  public static void main(String args[]){  
    Display obj = new Display();  
    obj.print();  
    obj.show();  
   }  
}  
