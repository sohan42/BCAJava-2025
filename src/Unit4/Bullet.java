package Unit4;

//Prgoram to demonstrate run time polymorphism.
class Bikes{  
  void run(){
    System.out.println("running");
  }  
}  

class Bullet extends Bikes{  
  @Override
  void run(){
    System.out.println("running safely with 60km");
  }  
  public static void main(String args[]){  
    Bikes b = new Bullet();  //Reference variable of Bike class (upcasting) 
    b.run();  
    //System.out.println(b.hashCode());
  }  
}

