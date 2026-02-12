package Unit3;

/*Create a class Person, which has name, age, address as attribute and multiple constructors 
to create object. Also a function to display all the details.*/
public class Person {
    private
      String name;
      int age;
      String address;
    public
      Person(){
         name = null; 
         age = 0;
         address = null;
      }
      Person(String n, int a){
          name=n;
          age=a;
          address=null;
      }
      Person(String n, int a, String ad){
          name=n;
          age=a;
          address=ad;
      }
      void display(){
          System.out.println("Name: "+name);
          System.out.println("Age: "+age);
          System.out.println("Address: "+address);
      }
      public static void main(String[] args){
          Person p1 = new Person();
          System.out.println("First Person...");
          p1.display();
          Person p2 = new Person("Raj",24,"Ithari-1");
          System.out.println("Second Person...");
          p2.display();
      }
}
