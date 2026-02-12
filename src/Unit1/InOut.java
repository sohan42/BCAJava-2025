
package Unit1;
//WAP to read a number from user and dispay it.

import java.util.Scanner;

public class InOut {
    private
            int num; //Integer type variable
    public
        void read(){
            System.out.println("Enter a number: "); //display message on console
            Scanner sc = new Scanner(System.in);//This class provide methods to read data
            num = sc.nextInt(); //read integer type data and stores on variable num
        }  
        void display(){ 
            System.out.println("Number: "+num); // '+' symbol is used here to concatinate message and data
        }
        
    public static void main(String[] args){
        InOut obj = new InOut(); //Creating an object for InOut class
        obj.read(); //calling read function
        obj.display(); //calling display function
    }
}
//WAP to calculate Simple Interest using the concept of class and object in java.