package Unit5;

import java.util.Scanner;

//Program to throw an exception explicitly.
public class ThrowExample {
    public static void main(String[] args) {
        try {
            int age;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter age: ");
            age = sc.nextInt();
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or older.");
            }
            System.out.println("Age is valid.");
        }
         catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}

