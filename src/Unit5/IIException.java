package Unit5;

//Unchecked custom exception to throw invalid input exception for validator.
public class IIException extends Exception{
    public IIException(){
        super();
    }
    public IIException(String message){
        super(message);
    }
}

class Validator{
     public void validateAge(int age) throws IIException {
        if (age < 0) {
            throw new IIException("Invalid age provided: " + age);
        }
        System.out.println("Valid age: " + age);
    }
     public static void main(String args[]){
         Validator v = new Validator();
        try {
            v.validateAge(-5);
        } catch (IIException e) {
            System.out.println("Error: " + e.getMessage());
        }
     }
}



