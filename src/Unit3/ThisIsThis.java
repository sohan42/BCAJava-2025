
package Unit3;

//Program to invoke current class instance variable using ‘this’ keyword.
class This1{
    private
      int a,b;
    public 
      This1(int a, int b){
          this.a=a;
          this.b=b;
      }
      void display(){
          System.out.println("a: "+a+" b: "+b);
      }
}

//Program to invoke current class constructor using ‘this’ keyword.
class This2{
    private
      int a,b;
    public This2(int a, int b){ //parameterized constructor
        this.a= a;
        this.b = b;
    }
    This2(){ //default constructor
        this(10,30); ////invoking parameterized constructor
        System.out.println("Sum: "+(a+b));
    }
}

//Program to return current class instance using ‘this’ keyword.
class This3{
      int a; 
    int b; 
   This3(){ //default constructor
        a = 1; 
        b = 2; 
    } 
     //Method that returns current class instance 
    This3 get(){ 
        return this; 
    } 
    //Displaying value of variables a and b 
    void display(){ 
        System.out.println("a = " + a + "  b = " + b); 
    } 
}

//Program to invoke current class method using ‘this’ keyword.
class This4{
    private 
      int a,b;
    public
      void display(){
          this.sum(); //invoke sum() method using this
          System.out.println("This is inside display function");
      }
      void sum(){
          a = 50;
          b = 30;
          System.out.println("Sum: "+(a+b));
      }
}

public class ThisIsThis {
    public static void main(String[] args){
        This4 t = new This4();
        t.display();
    }
}
