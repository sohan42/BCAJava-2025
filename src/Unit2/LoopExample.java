
package Unit2;

//Program to demonstrate different examples of loop statement.

import java.util.Scanner;

public class LoopExample {
    Scanner sc = new Scanner(System.in);
    //WAP to display numbers from 0 to 9 using while loop.
    void display0to9(){
        int i = 0;
        while(i<=9){
            System.out.print(i+" ");
            i++;
        }
    }
    //WAP to sum numbers from 1 to 10 using while loop.
    void sum0to9(){
        int sum=0,i=1;
        while(i<=10){
            sum+=i;
            i++;
        }
        System.out.println("Sum of 1 to 10: "+sum);
    }
    //WAP to display factorial of any number using do-while loop.
    void factorial(){
        long i,fac=1;
        System.out.println("Enter a number: : ");
        i=sc.nextLong();
        do{
            fac*=i;
            i--;
        }while(i>=1);
        System.out.println("Factorial is: "+fac);
    }
    //WAP count enterd numbers until user enters any negative or zero number using while loop.
    void count(){
        int c=0,n;
        boolean flag = true;
        do{
          System.out.println("Enter any number: ");
          n=sc.nextInt();
          if(n<=0){
              flag = false; 
          }
          c++;
        }while(flag);
        System.out.println("Count: "+c);
    }
    /*WAP to display given pattern using for loop.
    *
    * *
    * * *
    * * * *
    * * * * *
    */
    void pattern1(){
        int i,j;
        for(i=1;i<=5;i++){ //row
            for(j=1;j<=i;j++){ //column
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
    /*WAP to display given pattern using for loop.
    * * * * *
    * * * *
    * * *
    * * 
    * 
    */
    void pattern2(){
        int i,j;
        for(i=5;i>=1;i--){ //row
            for(j=1;j<=i;j++){ //column
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
    //Infinitive loop
    void infinitiveLoop(){
        for(;;){
            System.out.println("Stop...");
        }
    }
    //WAP to display elements of an array using for-each loop
    void forEach(){
        int a[] = {10,20,30,40,50};
        for(int x:a){
            System.out.println(x);
        }
    }
    //WAP to enter any numbers and sum them, when the sum reaches more than 100 then stop the process.
    void sum(){
        int sum=0,n;
        System.out.println("Enter any numbers:");
        for(;;){
            n = sc.nextInt();
            sum+=n;
            if(sum>100){
                break;
            }
        }
        System.out.println("Sum: "+sum);
    }
    /*WAP sum any ten numbers and display them, 
    when user enters any -ve number then bypass that itertion.*/
    void continuexample(){
        int sum=0,n,i;
        for(i=0;i<10;i++){
            System.out.println("Enter any number: ");
            n=sc.nextInt();
            if(n<0){
                continue;
            }
            sum+=n;
            System.out.println("Sum: "+sum);
        }
    }
    //WAP to return sum of any two numbers.
    int mySum(){
        int x,y;
        System.out.println("Enter any two numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        return (x+y);
    }
    //WAP to display multiplication table of any number entered by user.
    void table(){
        int i,n;
        System.out.println("Create multiplication table of : ");
        n=sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.print(n+"X"+i+"="+(i*n));
        }
    }
    //WAP to display prime numbers from 1 to 100.
    void prime(){
        System.out.print("Prime numbers are: ");
        int i,j,count=0;
        for(i=1;i<=100;i++){
            for(j=1;j<=i/2;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                 System.out.print(i+" ");
            }
            count=0;
        }
    }
    public static void main(String[] args){
        LoopExample e = new LoopExample();
        e.prime();
    }
}



