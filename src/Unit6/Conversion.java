package Unit6;

public class Conversion {
    public static void main(String[] args) {
        //string to integer
        String strint = "123";
        int number = Integer.parseInt(strint); 
        System.out.println(number); 
        
        //string to double
        String strdob = "3.14";
        double pi = Double.parseDouble(strdob); 
        System.out.println(pi);
        
        //string to boolean
        String strbool = "true";
        boolean flag = Boolean.parseBoolean(strbool); 
        System.out.println(flag);
        
        //integer to string
        int num = 42;
        String intstr = String.valueOf(num);
        System.out.println(intstr);
        
        //double to string
        Double dpi = 3.14;
        String dobstr = dpi.toString();
        System.out.println(dobstr);
    }
}
