package Unit6;

//Program to preform differnt operations on string using StringBuffer class and it's function
public class MyStringBuffer {
    public static void main(String args[]){
        StringBuffer s = new StringBuffer("Beautiful");
        s.append( " Nepal");
        System.out.println("After Append: " +s); //Beautiful Nepal
        s.insert(0, "Wow! " );
        System.out.println("After Insert: "+s); //Wow! Beautiful Nepal
        s.replace(15, 20, "Itahari");
        System.out.println("Replace Nepal: " +s);//Wow! Beautiful Itahari
        s.delete(0, 5);
        System.out.println("Delete Wow!: " +s); //Beautiful Itahari
        s.deleteCharAt(16);
        System.out.println("Delete index 16: " +s); //Beautiful Itahar
        s.reverse();
        System.out.println("Reverse: " + s); //rahatI lufituaeB
        s.reverse(); //Beautiful Itahar
        s.setCharAt(15, 'a');
        System.out.println("Add a at index 15: " +s); //Beautiful Itahaa
        System.out.println("length: "+s.length()); //16
        char ch = s.charAt(10);  
        System.out.println("Char at index 10: "+ch);//I
    }
}
