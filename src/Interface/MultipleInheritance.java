package Interface;

interface A1{
    void m1();
}

interface A2{
    void m1(int x);
}

class ChildInterface implements A1,A2{
    public void m1(){
        System.out.println("M1 Method of A1");
    }

    @Override
    public void m1(int x) {
        System.out.println("M1 Method of A2");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        ChildInterface obj = new ChildInterface();
        obj.m1();
        obj.m1(10);
    }
}
