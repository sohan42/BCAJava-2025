package Unit6;

//program to perform different string operations.
public class MyString {
    void checkChar(String s, int i){ //Program to retrieve a single character at a specified index.
        String str = s;
        char ch = str.charAt(i);
        System.out.println("Character at index 3: " + ch);
    }
    void ChangeCase(String s){ //Program to change case of the string.
        String STR = s.toUpperCase();
        System.out.println("Name in upper case: "+STR);
        String str = s.toLowerCase();
        System.out.println("Name in upper case: "+str);
    }
    void compare(String s1,String s2){//Program to compare two strings.
        if (s1.equals(s2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
    public static void main(String args[]){
        MyString ms = new MyString();
        ms.checkChar("Nepal",3);
        ms.ChangeCase("AbcD");
        ms.compare("Abc", "abc");
    }
}
