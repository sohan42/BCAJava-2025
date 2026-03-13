package Unit5;

//Program to demonstrate cause in exception handling.
class MyCause {
    public static void main(String[] args) throws Exception{
        try {
            divide(2, 0);
        }
	catch (ArithmeticException e) {
            System.out.println("Cause of Exception: "+ e.getCause());
        }
    }
    
    public static void divide(int a, int b) throws Exception{
        try {
            int i = a / b;
        }
	catch (ArithmeticException e) {
        // initializing new Exception with cause
        ArithmeticException exe = new ArithmeticException();
        exe.initCause(e);
        throw(exe);
        }
    }
}