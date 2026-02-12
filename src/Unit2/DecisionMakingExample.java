
package Unit2;
//Program to demonstrate different types of decision making statements.
import java.util.Scanner;

public class DecisionMakingExample {
    private
      int x,y,z;
      char c;
      Scanner sc = new Scanner(System.in);
    public
      void ifExample(){ //if statment: to check larger number
        System.out.println("Enter two numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>y){
            System.out.println(x+" is greater than "+y);
        }
        System.out.println("End of the program...");  
      }
      void ifOdd(){ //WAP to check if given number is odd.
          System.out.println("Enter a number: ");
          x = sc.nextInt();
          if(x%2==1){ //checks if a number is odd.
              System.out.println(x+" is odd! ");
          }
      }
     void checkLarger(){ //WAP to compare two number and display which one larger.
         System.out.println("Enter two numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>y){
            System.out.println(x+" is greater than "+y);
        }
        else{
            System.out.println(y+" is greater than "+x);
        }
     } 
     void checkEvenOdd(){ //WAP to check a number is even or odd.
         System.out.println("Enter a number: ");
          x = sc.nextInt();
          if(x%2==0){ //checks if a number is even.
              System.out.println(x+" is even! ");
          }
          else{ //Will execute when number is odd.
              System.out.println(x+" is odd! ");
          }
     }  
     void Larger3(){ //WAP to display larger among three numbers.
         System.out.println("Enter 3 numbers: ");
          x = sc.nextInt();
          y = sc.nextInt();
          z = sc.nextInt();
          if((y>x)||(z>x)){
              if(y>z){
                  System.out.println(y+" is largest!");
              }
              else{
                  System.out.println(z+" is largest!");
              }
          }
          else{
             System.out.println(x+" is largest!");
          }
     }
     /*WAP to enter a number and check if a number is divisible by 5 or not. 
    If it is divisible by 5, then also check the number is even or odd. 
    Use the concept of nested if statement*/
    void divisible5(){
        System.out.println("Enter a number: ");
          x = sc.nextInt();
          if(x%5==0){ //check if number is divisible by 5.
            if(x%2==0){ //checks if a number is even.
                System.out.println(x+" is divisible and even! ");
            }
            else{ //Will execute when number is odd.
                System.out.println(x+" is divisible and odd! ");
            }
          }
          else{
            System.out.println(x+" is not divisible by 5!");
          }
    } 
    /*WAP to check voting eligiblity. To be eligible, person's age should be >=18 and must be
    neplease citizen. Use the concept of nested if statement.*/
    void isEligible(){
        System.out.println("Please answer below questions to chcek your voting eligibility...");
        System.out.println("Are you a Nepali Citizen? (y/n)");
        c = sc.next().charAt(0);
        if(c == 'y'){
            System.out.println("Enter your age: ");
            x=sc.nextInt();
            if(x>=18){
                System.out.println("Congratulations you're eligible for voting!");
            }else{
                System.out.println("Your age is below 18, so you can't vote now!");
            }
        }else{
            System.out.println("Only Nepali citizen can vote!");
        }
    }
    /*WAP to check grade of the student using the marks obtained in 5 different subjects. Ask marks and 
then calculate the average. Then check grade using the concept of if-else-if statement.
(Hints: average>=90 grade A+
        average>=80 grade A    
        average>=70 grade B+
        average>=60 grade B
        average>=50 grade C+
        average>=40 grade C
        average>=30 grade D
        average<30 fail) */
    void chckGrade(){
        int s1,s2,s3,s4,s5,avg;
        System.out.println("Enter marks obtaind in 5 subjects: ");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        s4 = sc.nextInt();
        s5 = sc.nextInt();
        avg = (s1+s2+s3+s4+s5)/5;
        if(avg>=90){
            System.out.println("Grade A+");
        }
        else if(avg>=80){
            System.out.println("Grade A");
        }
        else if(avg>=70){
            System.out.println("Grade B+");
        }
        else if(avg>=60){
            System.out.println("Grade B");
        }
        else if(avg>=50){
            System.out.println("Grade C+");
        }
        else if(avg>=40){
            System.out.println("Grade C");
        }
        else if(avg>=30){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail!");
        }
    }
    /*WAP to create MCQ question having 4 choices. if user chooses right answer then 
    display correct else display incorrect. Use the concept of if-else-if statement.*/
    void MCQ(){
        char c;
        System.out.println("Choose corrct answer: (a/b/c/d)");
        System.out.println("What is the capital city of Nepal? ");
        System.out.println("a) Itahari       b) Kathmandu") ;
        System.out.println("c) India       d) Pakistan") ;
        c = sc.next().charAt(0);
        if(c=='a'){
            System.out.println("Incorrect!");
        }
        else if(c=='b'){
            System.out.println("Correct!");
        }
        else if(c=='c'){
            System.out.println("Incorrect!");
        }
        else if(c=='d'){
            System.out.println("Incorrect!");
        }
        else{
            System.out.println("Invalid Input!");
        }
    }
    /*WAP to enter any character, then check that character is vowel or not. 
    Use the concept of switch statement.*/
    void checkVowel(){
        char ans;
        System.out.println("Enter any character: ");
        ans = sc.next().charAt(0);
        switch(ans){
            case 'a':
                System.out.println(ans+" is vowel.");
                break;
            case 'e':
                System.out.println(ans+" is vowel.");
                break;   
            case 'i':
                System.out.println(ans+" is vowel.");
                break;
            case 'o':
                System.out.println(ans+" is vowel.");
                break;    
            case 'u':
                System.out.println(ans+" is vowel.");
                break; 
            default:
                System.out.println(c+" is not vowel.");
        }
    }
    /*WAP to enter any two number and ask user to choose any arithmtic operator (+,-,*,/,%). 
    Based on choosen operator perform the same operaion using entered input.*/
    void chooseOp(){
        char op;
        System.out.println("Enter any two numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Enter any oprator (+,-,*,/,%): ");
        op = sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("Sum: "+(x+y));
                break;
            case '-':
                System.out.println("Difference: "+(x-y));
                break;   
            case '*':
                System.out.println("Product: "+(x*y));
                break;
            case '/':
                System.out.println("division: "+(x/y));
                break;    
            case '%':
                System.out.println("Sum: "+(x/y));
                break; 
            default:
                System.out.println("Invalid Operator!");
        }
    }
    public static void main(String args[]){
        DecisionMakingExample e = new DecisionMakingExample();
        e.chooseOp();
    }
} 





