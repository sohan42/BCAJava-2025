package Unit4;

//Program to demonstrate interface.
interface Drawable{  //interface
  void draw();  
}  
class Rectangle implements Drawable{  //Rectangle class
  @Override
  public void draw(){
    System.out.println("drawing rectangle");
  }  
}  
class Circle implements Drawable{  //Circle class
  @Override
  public void draw(){
    System.out.println("drawing circle");
  }  
}  
class Test2{  
public static void main(String args[]){  
  Drawable d=new Circle(); //upcasting
  d.draw();  
  }
}  
