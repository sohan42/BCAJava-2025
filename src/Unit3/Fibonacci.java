
package Unit3;

//WAP to deisplay fibonacci numbers upto given length using recursive function.
import java.util.Scanner;

public class Fibonacci {
    private
        int a=0,b=1,c=0;    
    public
        void fib(int count){    
            if(count>0){    
                 c = a + b;    
                 a = b;    
                 b = c;    
                 System.out.print(" "+c);   
                 fib(count-1);    
             }    
 }    
 public static void main(String args[]){ 
    Fibonacci f = new Fibonacci(); 
    Scanner s = new Scanner(System.in);
    System.out.printf("Enter Number: ");
    int count = s.nextInt();
    System.out.print(0+" "+1);//printing 0 and 1    
    f.fib(count-2);//n-2 because 2 numbers are already printed   
 }  
}
