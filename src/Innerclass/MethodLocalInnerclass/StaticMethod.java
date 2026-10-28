package Innerclass.MethodLocalInnerclass;

class Outer1{
    int a = 10;  // we cant access this instance variable if we declare the method as static
    static int y =20;

    static void disp(){
        class Inner1{
            void dispInner1(){
                //System.out.println(x);   // This valus cant be accessed because the method is static so gets CE
                                         //  Non-static Variables cant be referenced from static context
                System.out.println(y);
            }
        }
    }
}

public class StaticMethod {
    public static void main(String[] args) {

    }
}
