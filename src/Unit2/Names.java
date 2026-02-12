
package Unit2;

//WAP to read any five names and display them, use the concept of array.
/* Name: Sohan  
   Date: 2025-Dec-10
   Time: 8:54 am 
*/

import java.util.Scanner;

public class Names {
    private
            String name[] = new String[5];
            int i;
            Scanner sc = new Scanner(System.in);
    public 
            void readNames(){
                System.out.println("Enter five names :");
                for(i=0;i<name.length;i++){
                    name[i] = sc.next();
                }
            }
            void display(){
                System.out.println("5 names are:");
                for(i=0;i<name.length;i++){
                    System.out.println(name[i]);
                }
            }
            public static void main(String args[]){
                Names n = new Names();
                n.readNames();
                n.display();
            }
}
