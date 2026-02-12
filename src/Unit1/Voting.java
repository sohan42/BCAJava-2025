/*WAP to check voting eligibility of the person using age. If person is eligible then return true else retrun false.
USe the concept of class and object.
(Hint: Age must be >=18, to be eligible)*/

package Unit1;

import java.util.Scanner;

public class Voting{
    private
            int age;
    public 
            void readAge(){
                System.out.println("Enter your age: ");
                Scanner sc = new Scanner(System.in);
                age = sc.nextInt();
            }
            boolean isEligible(){
                return (age>=18);
            }
            public static void main(String[] args){
                Voting v = new Voting();
                v.readAge();
                if(v.isEligible()){
                    System.out.println("Eligible for voting!");
                }
                else{
                    System.out.println("Not Eligible!");
                }
            }
}
