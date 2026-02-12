
package Unit2;

public class Constant {
    private
            final float pi = 3.14f;
            static final float NOE = 2;
            /*void setPi(){
                System.out.println("Enter value of pi: ");
                Scanner sc = new Scanner(System.in);
                pi = sc.nextFloat(); //Error
            }*/
    public static void main(){
        Constant c = new Constant();
        System.out.println("Value of pi: "+c.pi);        
        System.out.println("Number of ears: "+Constant.NOE);        
    }
}
