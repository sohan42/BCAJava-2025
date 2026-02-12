package Unit3;

/*Create a class Multiply, Which has 3 functions of the same name. first function will multiply two intger numbers,
Second function will multiply three integer numbers function and third function 
will multiply 2 double type numbers*/
public class Multiply {
    public
      int mul(int x, int y){
          return (x*y);
      }
      int mul(int x, int y, int z){
          return (x*y*z);
      }
      double mul(double x, double y){
          return (x*y);
      }
      public static void main(String[] args){
          Multiply m = new Multiply();
          System.out.println("Product of two intger numbers: "+m.mul(10, 20));
          System.out.println("Product of three intger numbers: "+m.mul(10, 20,30));
          System.out.println("Product of two double type numbers: "+m.mul(10.20, 20.22));
      }
}

 