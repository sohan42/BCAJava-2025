
package Unit1;
//WAP to calculate Simple Interest using the concept of class and object in java.

import java.util.Scanner;

public class SimpleInterest {
    private
            float si,p,t,r;
    public
            void read(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Principle, time and rate");
                p = sc.nextFloat();
                t = sc.nextFloat();
                r = sc.nextFloat();
            }
            void calculate(){
                si=(p*t*r)/100;
                System.out.println("Simple Interest is "+si);
            }
    public static void main(String args[]){
        SimpleInterest s = new SimpleInterest();
        s.read();
        s.calculate();
    }  
}


