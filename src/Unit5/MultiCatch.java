package Unit5;

//Program to handle two different exceptions using multiple catch blocks.
public class MultiCatch{
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);  // This will throw an ArrayIndexOutOfBoundsException
            int result = 10/0;  // This will throw an ArithmeticException
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured: " + e.getMessage());
        }
         finally{
           System.out.println("Continue execution!");		
         }
    }  
}
