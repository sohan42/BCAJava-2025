
package Unit4;

//Simple program to demonstrate multilevel inheritance.
class Teacher { 
   void teach(){
       System.out.println("Teaching subject");
   }
}
class Student extends Teacher{
    void listen(){
        System.out.println("Listening");
    }
}
class HomeTution extends Student{
    void explains(){
        System.out.println("Does homework");
    }
}
/*Create a class Vehicle which has a wheel data member, also create its setter and getter.
Derive a class Bike which has a speed data member, also crate its setter and getter. 
Derive a class Yamaha from bike class which has its data member version, also create its setter and getter. 
Create an instance of Yamaha class and invoke all the methods in main function.*/
class Vehicle{
    private
      int wheel;
    void setWheel(int w){
        wheel = w;
    }
    int getWheel(){
        return wheel;
    } 
}
class Bike extends Vehicle{
    private
      int speed;
    void setSpeed(int s){
        speed = s;
    }
    int getSpeed(){
        return speed;
    } 
}
class Yamaha extends Bike{
    private
      String version;
    public
      void setVersion(String v){
        version = v;
    }
    String getVersion(){
        return version;
    } 
}
public class Multilevel{
    public static void main(String arge[]){
        Yamaha y = new Yamaha();
        y.setWheel(2);
        y.setVersion("V3");
        y.setSpeed(150);
        System.out.println("Number of wheels: "+y.getWheel());
        System.out.println("Yamaha bike Version: "+y.getVersion());
        System.out.println("Speed is: "+y.getSpeed()+" KPH");
    }
}



