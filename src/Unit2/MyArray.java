package Unit2;

import java.util.Scanner;

/* Create a program to insert some numbers in an array and also disply them. Using the concept of 
class and object. Also return array using function. Create another class OperationA to perform
different opration on elements of an array, like addition, multiplication, greater and smaller.*/
class OperationA{
    private
            MyArray m;
            int[] arr; 
            int sum=0,product=1,large,small,i,temp;
    public
            void setArray(MyArray ma){ //Intialize array using object of MyArray class
                this.m=ma;
                arr = m.getData();
            }
            void sumA(){ //performs sum on elements of an array
                for(i=0;i<arr.length;i++){
                    sum+=arr[i];
                }
                System.out.println("Sum of elements: "+sum);
            }
            void mulA(){ //performs multiplication on elements of an array
                for(i=0;i<arr.length;i++){
                    product*=arr[i];
                }
                System.out.println("product of elements: "+product);
            }
            void larger(){
                temp = arr[0];
                 for(i=1;i<arr.length;i++){
                    if(arr[i]>temp){
                        temp = arr[i];
                    }
                }
                 System.out.println("Largest element: "+temp);
            }
            void smaller(){
                temp = arr[0];
                 for(i=1;i<arr.length;i++){
                    if(arr[i]<temp){
                        temp = arr[i];
                    }
                }
                 System.out.println("Smallest element: "+temp);
            }
}

public class MyArray{
    private
            int[] num;
            int size,i;
            Scanner sc = new Scanner(System.in);
    public        
        void askSize(){
            System.out.println("How many numbers do you want to enter? ");
            size = sc.nextInt();
            num = new int[size]; //initialize num array
        }
        void readData(){
            System.out.println("Enter "+size+" numbers: ");
            for(i=0;i<size;i++){ //loop to read elements
                num[i]=sc.nextInt();
            }
        }
        void display(){
            System.out.println("Elements of an array: ");
            for(i=0;i<size;i++){ //display elements of an array
                System.out.println("Element "+(i+1)+" :"+num[i]);
            }
        }
        int[] getData(){ //returning an array
            return num;
        }
    public static void main(String[] args){
        MyArray m = new MyArray();
        m.askSize();
        m.readData();
        //m.display(); 
        
        OperationA a = new OperationA();
        a.setArray(m);
        a.sumA(); 
        a.mulA();
        a.larger();
        a.smaller();
    }
}
