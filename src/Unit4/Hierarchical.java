package Unit4;

//Program to demonstrate hierarchical inheritance.
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
class Principle extends Teacher{
    void evaluate(){
        System.out.println("Evaluating");
    }
}
/*Create a class Animal which has a function eat(). Derive Bird from Animal class which has a function fly(). 
Again derive a class Fish from Animal class which has a function swim().*/
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flying...");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swimmming...");
    }
}
public class Hierarchical {
    public static void main(String[] args){
        Bird b = new Bird();
        System.out.println("Bird");
        b.eat();
        b.fly();
        Fish f = new Fish();
        System.out.println("Fish");
        f.eat();
        f.swim();
    }
}

