package Unit2;

class Integral{
    private
        int a = 100;
    public
            void display(){
                System.out.println("Decimal Literals: "+a);
                a = 0725;
                System.out.println("Octal Literals: "+a);
                a = 0xFF5;
                System.out.println("Hexadecimal Literals: "+a);
                a = 0b1111;
                System.out.println("Binary Literals: "+a);
            }
}

class FloatingPoint{
    private 
            float a = 1.00f;
    public 
            void display(){
                System.out.println("Floating point literal: "+a);
                a = 0152.78f;
                System.out.println("Floating point literal: "+a);
                //a = 0x845.8;
            }
}

class Char{
    private
            char c;
    public 
            void operation(){
                c = 'a'; //single quote
                System.out.println("c: "+c);
                c = 050; //Integral literal
                System.out.println("c: "+c);
                c = '\u0048'; //unicode
                System.out.println("c: "+c);
                c = '\n'; //escape squence
                System.out.println("Java "+c+"Programming");
            }
}

class MyString{
    private
            String s;
    public 
            void display(){
                s = "Itahari";
                System.out.println("String: "+s);
                s = "This is java programming\n"+ "class, we're studying about\n"+"litrals";
                System.out.println("String: "+s);
            }
            
            void bool(){
                boolean b = true;
                System.out.println("status: "+b);
            }
}

public class Literals{
    public static void main(String args[]){
        MyString ms = new MyString();
        ms.display();
        ms.bool();
        
        /*Char obj = new Char();
        obj.operation();
        
        Integral lt = new Integral();
        lt.display();
        
        FloatingPoint fp = new FloatingPoint();
        fp.display();*/
    }
}

   