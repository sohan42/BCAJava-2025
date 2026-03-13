package Unit5;

import java.util.Scanner;

//Arithmetic Exception handling using try-catch blocks.
public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu,de,result;
        System.out.println("Enter Numenator: ");
        nu = sc.nextInt();
        System.out.println("Enter denominter: ");
        de = sc.nextInt();
        try{
            result=nu/de;
            System.out.println("Divisoin is: "+result);
        }catch(ArithmeticException e){
            System.out.println("Exception occured: "+ e.getMessage());
        }
        finally{
            System.out.println("Executed Successfully!");
        }
    }
}

