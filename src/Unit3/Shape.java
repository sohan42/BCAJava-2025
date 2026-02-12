package Unit3;

import java.util.Scanner;

/*Create a class Shape which has three function to calculate area of circle, triangle and rectangle.
Use the concecpt of function overloading and ask data to user.*/
public class Shape{
    public
    float area(float r){
        return (3.14f*r*r);
    }
    float area(float b, float h){
        return(0.5f*b*h);
    }
    int area(int l, int b){
        return (l*b);
    }
    public static void main(String[] args){
        Shape s = new Shape();
        Scanner sc = new Scanner(System.in);
        float r,b,h;
        int l,br;
        System.out.println("Enter radius of circle: ");
        r = sc.nextFloat();
        System.out.println("Enter breadth and height of triangle: ");
        b = sc.nextFloat();
        h = sc.nextFloat();
        System.out.println("Enter length and breadth of reactangle: ");
        l = sc.nextInt();
        br = sc.nextInt();
        System.out.println("Area of circle is: "+s.area(r));
        System.out.println("Area of triangle is: "+s.area(b,h));
        System.out.println("Area of rectangle is: "+s.area(l,br));
    }
}
/*Create a class Plus, which has two functions. First function will add two numbers and second function 
    will add two strings. Use the concept of function overloading.*/

