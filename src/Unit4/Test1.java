package Unit4;

// Invoking parameterized constructor of parent class using super keyword.
class Person1{  
    int id;  
    String name;  
    Person1(int id,String name){  
      this.id=id;  
      this.name=name;  
      }  
}  
class Emp extends Person1{  
    float salary;  
    Emp(int id,String name,float salary){  
      super(id,name);              //reusing parent constructor  
      this.salary=salary;  
    }  
    void display(){
      System.out.println(id+" "+name+" "+salary);
    }  
}  
public class Test1 {
    public static void main(String[] args){  
        Emp e1=new Emp(1,"Raj",45000);  
        e1.display();  
  }
}
