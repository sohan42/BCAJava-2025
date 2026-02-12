
package Unit2;

public class Conversion {
    private 
            int a = 10;
            float b = 10.10f;
    public 
            void widening(){
                b = a;
                System.out.println("Automatic or widening...");
                System.out.println("a: "+a);
                System.out.println("b: "+b);
            }
            void narrowing(){
                b = 20.20f;
                //a = b;//error
                a = (int) b;
                System.out.println("Casting or narrowing...");
                System.out.println("b: "+b);
                System.out.println("a: "+a);
            }
    public static void main(String[] args){
        Conversion c = new Conversion();
        c.widening();
        c.narrowing();
    }
}
