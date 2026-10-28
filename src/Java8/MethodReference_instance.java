package Java8;

class Demo{
    void test(){
        System.out.println("Instance Method Reference");
    }
}

public class MethodReference_instance {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Runnable r =  d1 :: test;     ///  Object Reference :: MethodName();
        r.run();
    }
}
