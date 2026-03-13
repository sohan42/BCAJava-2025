package Unit5;

//Handling multipl exceptions using single catch block.
public class SingleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);  // This will throw an ArrayIndexOutOfBoundsException
            int result = 10/0;  // This will throw an ArithmeticException
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception occured: " + e.getMessage());
        } 
         finally{
           System.out.println("Continue execution!");		
         }
    }
}
