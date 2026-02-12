
package Unit3;

//WAP to copy the values of one object into another using java constructor.
public class Student {
    private
      int id;
      String name;
    public
      Student(int i, String n){
          id=i;
          name=n;
      }
      Student(Student s){
          id=s.id;
          name=s.name;
      } 
      void display(){
          System.out.println("Id: "+id);
          System.out.println("Name: "+name);
      }
    public static void main(String[] args){
        Student s1 = new Student(1,"Aman");
        s1.display();
        Student s2 = new Student(s1);
        s2.display();
    }  
}
