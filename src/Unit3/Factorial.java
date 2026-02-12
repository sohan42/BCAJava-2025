package Unit3;

public class Factorial {
     int fact(int n){
        int result;
        if(n==1){
         return 1;   
        }
        else{
        result = fact(n-1)*n;
        return result;
        }
    }
     public static void main(String[] args){
         Factorial f = new Factorial();
         System.out.println("Factorila of 6: "+f.fact(6));
     }
}
