package Unit2;

public class Operator{
    private 
            int x,y;
    public
            void unary(){
                x=10;  
   	        y=5;
        	System.out.println("x after pre-increment: "+ ++x); //Pre-increment
        	System.out.println("x after pre-decrement: "+ --x); //pre-decrement  
        	System.out.println("y after post-increment: "+ y++); //Post-increment
        	System.out.println("y after post-decrement: "+ y--); //Post-decrement                 
            }
            void arithemtic(){
                x=20;  
   	        y=2;
                System.out.println("Sum: "+ (x+y)); //addition
                System.out.println("Subtraction: "+ (x-y)); //Subtraction
                System.out.println("Multiplication: "+ (x*y)); //Multiplication
                System.out.println("Division: "+ (x/y)); //division
                System.out.println("Modulus: "+ (x%y)); //Modulus
            }
            void relational(){
                x = 10;
                y = 7;
              System.out.println("x == y = " + (x == y) ); //equal to
              System.out.println("x != y = " + (x != y) ); //not equal to
              System.out.println("x > y = " + (x > y) ); //greater than
              System.out.println("x < y = " + (x < y) ); //less than
              System.out.println("x >= y = " + (x >= y) ); //gerater than or equal to
              System.out.println("x <= y = " + (x <= y )); //less than or equal to
            }
            void bitwise(){
                x=20;
                y=5;
                System.out.println("x&Y: "+(x&y));
                System.out.println("x|Y: "+(x|y));
                System.out.println("x^Y: "+(x^y));
                System.out.println("~x: "+(~x));
                System.out.println("x<<2: "+(x<<2));
                System.out.println("x>>2: "+(x>>2));
            }
            void logical(){
                boolean a = true;
                boolean b = false;
                System.out.println("(a&&b): "+(a&&b));
                System.out.println("(a||b): "+(a||b));
                System.out.println("!(a||b): "+!(a||b));
                
                x=10;
                y=5;
                int z = 15; 
                System.out.println("((x>y)&&(x>z)): "+((x>y)&&(x>z)));
                System.out.println("((x>y)||(x>z)): "+((x>y)||(x>z)));
                System.out.println("!((x>y)||(x>z)): "+!((x>y)||(x>z)));
            }
            void assignment(){
                x=10;
                y=2; 
                System.out.println("x+=y: "+(x+=y));
                System.out.println("x-=y: "+(x-=y));
                System.out.println("x/=y: "+(x/=y));
                System.out.println("x*=y: "+(x*=y));
                System.out.println("x%=y: "+(x%=y));
            }
            void ternary(){
                 x = 10;
                 y = (x == 10) ? 20: 30;
                 System.out.println( "Value of y is : " +  y );

                x = 20; 
                y = 40;
                String out; 
                out = (x == y) ? "yes":"No";
                System.out.println("Result= "+out);
            }
            void checkIntance(){
                String name = "James";
                Operator op = new Operator();
                // following will return true since name is type of String
                boolean result1 = name instanceof String;
                boolean result2 = op instanceof Operator;
                System.out.println( "name is instance of String? "+result1 );
                System.out.println( "op instance of Operator? "+result2 );
            }
    public static void main(String[] args){
        Operator op = new Operator();
        op.checkIntance();
    }
}
