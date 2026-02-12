
package B;

import A.Abc;

class Test{
    private 
      int a;
    public
      void setA(int a){
          this.a = a;
      }
}

public class Example extends Abc{
    public static void main(String args[]){
    Example obj = new Example();
    obj.msg();
    }
}

