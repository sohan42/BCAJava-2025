
package Unit3;

class PassByValue{
    void add(int a){ //called method
        a = a+5;
    }
}

class PassByRef{
    int a = 5;
    void add(PassByRef p){
        p.a = p.a+5;
    }
}

public class MyPass {
    public static void main(String[] args){
       PassByRef p = new PassByRef();
       System.out.println("The value of a before call: "+p.a);
       p.add(p);
       System.out.println("The value of a after call: "+p.a);
    }
}
