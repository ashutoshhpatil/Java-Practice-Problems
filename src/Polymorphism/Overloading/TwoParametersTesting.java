package Polymorphism.Overloading;

public class TwoParametersTesting {

    void s1(int i,float f){
        System.out.println("int-float version");
    }

    void s1(float f, int i){
        System.out.println("float-int version");
    }


    public static void main(String[] args) {
        TwoParametersTesting tp = new TwoParametersTesting();
        tp.s1(10,10.5f);
        tp.s1(10.5f,20);
        //tp.s1(10,10); --> CompileTime Error : ambiguity comes
    }
}
