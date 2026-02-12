package Unit2;

import java.util.Scanner;

public class My2DArray {
    private
            int[][] num ; //int type array declaration
            int i,j,r,c;
            Scanner sc = new Scanner(System.in);
    public 
            void askSize(){ //ask size of the array 
                System.out.println("Enter size of the row and column");
                r = sc.nextInt();
                c = sc.nextInt();
                num = new int[r][c]; //initialize array
            }
            void readData(){
                System.out.println("Enter "+(r*c)+" numbers: ");
                for(i=0;i<r;i++){
                    for(j=0;j<c;j++){
                        num[i][j] = sc.nextInt();
                    }
                }
            }
            void display(){
                System.out.println(r+"X"+c+" matrix is: ");
                for(i=0;i<r;i++){
                    for(j=0;j<c;j++){
                        //System.out.print(num[i][j]+" ");
                        System.out.println("Elements at: "+i+j+": "+num[i][j]);
                    }
                    //System.out.println();
                }
            }
            public static void main(String[] args){
                My2DArray a2 = new My2DArray();
                a2.askSize();
                a2.readData();
                a2.display();
            }
}




