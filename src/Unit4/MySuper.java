package Unit4;

//Program to demonstrate use of super keyword to use parent class variable, function and default constructor.
class Animal1{
   protected 
    String color="White"; 
    Animal1(){//default constructor
        System.out.println("Animal is created");
    }
    void eat(){
        System.out.println("Eating...");
    }
}  
class Dog extends Animal1{  
    String color="Black";  
    Dog(){ //default constructor
        super(); //this is optional because compiler automatically call the parent class default constructor
       System.out.println("Dog is created"); 
    }
    void printColor(){  
      System.out.println(color); //prints color of Dog class  
      System.out.println(super.color);//prints color of Animal class  
    }  
    void work(){
        System.out.println("Dog is sleeping...");
        super.eat(); ////invoke function eat() of Animal class
    }
}  
public class MySuper {
    public static void main(String args[]){
        Dog d = new Dog();
        d.printColor();
        d.work();
    }
}
