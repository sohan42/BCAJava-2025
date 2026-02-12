
package Unit3;

//Program to demonstrate static data memeber by making company name static.
class Company{
    private
      int id;
      String name;
    public
      static String Company_name = "ABC Pvt. Ltd."; //static data memeber  
    Company(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Company name: "+Company_name);
    }
}

//Program to demonstrate static method.
class Student{
    private
      int id;
      String name;
    public
      static String college_name; //static variable
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    static void setCollege(){ //static function
        college_name = "INC";
    }
    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("College name: "+college_name);
    }
}

//Prorgam to demonstrat static block.
class SBlock{
    private
        static int a=4; 
        static int b=6;
        static int total;
    // static block 
    static{ 
        System.out.println("Static block initialized."); 
        total = a + b; 
    }
}
public class MyStatic {
    public static void main(String[] args){
        System.out.println("Sum is: "+SBlock.total);
    }
}
