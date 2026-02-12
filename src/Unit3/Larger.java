
package Unit3;

/*Create a class Larger, which has three data members to store numbers and 
a parameterized constructor to intialize them. It has a function which compares and returns
larger number.*/ 
public class Larger {
    private
      int a,b,c;
    public
      Larger(int x, int y, int z){
          a=x;
          b=y;
          c=z;
      }
      int compare(){
          if(a>b && a>c){
              return a;
          }
          else if(b>c){
              return b; 
          }
          else{
              return c;
          }
      }
      public static void main(String args[]){
          Larger l = new Larger(20,45,25);
          System.out.println("Larger number: "+l.compare());
      }
}
