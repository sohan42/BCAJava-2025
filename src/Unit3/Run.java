package Unit3;

import java.util.Scanner;

class Box{
    private
        float b,h,l;
    public
      void setData(float b, float l, float h){
          this.b = b;
          this.h = h;
          this.l = l;
      }
      float area(){
          return 2*(l*b+l*h+b*h);
      }
      float volume(){
          return (l*b*h);
      }
}

/* Create a class Tiger, which has attributes name, weight, height and strength. Create a function 
    to set these attributes. Also create a function to display all details. Then, create an object for 
    2 tigers.*/
class Tiger{
    private
      String name;
      float weight, height, strength; 
    public
      void setDetails(){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Tiger name: ");
          name = sc.next();
          System.out.println("Enter Tiger weight in kg: ");
          weight = sc.nextFloat();
          System.out.println("Enter Tiger height in ft: ");
          height = sc.nextFloat();
          System.out.println("Enter Tiger strength in PSI: ");
          strength = sc.nextFloat();
      }
      void display(){
          System.out.println("Name: "+name);
          System.out.println("Weight: "+weight+"kg");
          System.out.println("Height: "+height+"ft");
          System.out.println("Strength: "+strength+"PSI");
      }
}
public class Run {
    public static void main(String[] args){
       Tiger t1 = new Tiger();
       Tiger t2 = new Tiger();
       System.out.println("Enter 1st tiger details: ");
       t1.setDetails();
       System.out.println("Enter 2nd tiger details: ");
       t2.setDetails();
       System.out.println("1st Tiger Details are: ");
       t1.display();
       System.out.println("2nd Tiger Details are: ");
       t2.display();
    }
}
