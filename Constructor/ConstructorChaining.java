package Constructor;

class Test{
    Test(double d){
        this(10);
        System.out.println("Double args Constructor");
    }
    Test(int i){
        this();
        System.out.println("int args Constructor");
    }
    Test(){
        System.out.println("No args Constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Test t1 = new Test(10.5);
    }
}
