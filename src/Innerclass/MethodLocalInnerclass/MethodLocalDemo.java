package Innerclass.MethodLocalInnerclass;

class Outer{

    void dispInfo(){
        int x = 20;      //"Effectively Final" Rule (Java 8+)
        class Inner{
            void sum(int a,int b){
                System.out.println("The Sum: "+(a+b));
                System.out.println("The Value of X: "+x);
            }
        }

        Inner inner = new Inner();
        inner.sum(10,20);
        inner.sum(100,200);
        inner.sum(1000,2000);
        inner.sum(2000,3000);
    }
}

public class MethodLocalDemo {
    public static void main(String[] args){
        Outer outer =  new Outer();
        outer.dispInfo();
    }
}
