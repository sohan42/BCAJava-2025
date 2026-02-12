package Unit3;

//Example of Memner inner class
class MemberInner{ //Outer class
   private int a=50;
   public void show(){
       Inner in = new Inner();
       in.display();
   }
    // Simple nested inner class
  public class Inner{ 
      public void display() { 
           System.out.println("In a nested class method");
           System.out.println("value of a: " +a);
      } 
   } 
}

class MethodLocal{ //Outer class
    void outerMethod(){ 
        System.out.println("inside outerMethod"); 
             // Inner class is local to outerMethod() 
        class Inner { 
            void innerMethod() { 
                System.out.println("inside innerMethod"); 
            } 
        } 
        Inner y = new Inner(); 
        y.innerMethod(); 
    }  
}

abstract class Person{  
  abstract void eat();  
}  

class NestedStatic{ //Outer class
   static void outerMethod() { 
     System.out.println("Outer class"); 
   } 
   static class Inner { // A static inner class  
     void temp(){
       System.out.println("Inner class");
     }
  }
}   

public class InnerClass {
    public static void main(String[] args){
        NestedStatic.outerMethod(); 
        NestedStatic.Inner in = new NestedStatic.Inner();
        in.temp();
    }
}
