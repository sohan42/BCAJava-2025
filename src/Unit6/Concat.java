package Unit6;

public class Concat {
    public static void main(String args[]){
        String fn = "Raju";
        String ln = " Bhai";
        String fullName = fn + ln; //concatination using + operator
        System.out.println(fullName);
        String result = fn.concat(ln); //using concat() function
        System.out.println(result);
    }
}
