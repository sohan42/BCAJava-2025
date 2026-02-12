
package Unit4;

//Simple program to demonstrate single inheritance.

import java.util.Scanner;

class Fruit { 
   void apple(){
       System.out.println("Apple is red");
   }
}
class Vegetable extends Fruit{
    void cauliflower(){
        System.out.println("Cauliflower is green");
    }
}

/*Create a class person with a data memebers name, and address. Also two funtion to set and display 
these details. Create a child class Employee, which has data memebers id and salary. 
Also two funtion to set and display these details. Now, create an object of child class and display all details.*/ 
class Person{
    private
      String name;
      String address;
    public
      void setPerson(){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter name: ");
          name = sc.nextLine();
          System.out.println("Enter address: ");
          address = sc.nextLine();
      }
      void displayPerson(){
          System.out.println("Name: "+name);
          System.out.println("Address: "+address);
      }
}
class Employee extends Person{
    private
      int id;
      float salary;
    public 
      void setEmp(){
         Scanner sc = new Scanner(System.in);
          System.out.println("Enter id: ");
          id = sc.nextInt();
          System.out.println("Enter salary: ");
          salary = sc.nextFloat(); 
      }
      void displayEmp(){
          System.out.println("Id: "+id);
          System.out.println("Salary: "+salary);
      }
}

public class Single {
    public static void main(String[] args){
        Employee e = new Employee();
        e.setPerson(); //parent class function
        e.setEmp(); //chlid class funtion
        e.displayPerson(); //parent class function
        e.displayEmp();//chlid class funtion
    }
}

