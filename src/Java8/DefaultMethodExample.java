package Java8;

interface Left{
    default void m1(){
        System.out.println("Left Side of Interface");
    }
}

interface Right{
    default void m1(){
        System.out.println("Right Side of Interface");
    }
}

public class DefaultMethodExample implements Left,Right{
          public void m1(){
            System.out.println("My own m1() method");
            Left.super.m1();   /// To call Left Interface
            Right.super.m1();  /// To call Right Interface
        }

    public static void main(String[] args) {
        DefaultMethodExample d = new DefaultMethodExample();
        d.m1();
    }
    }

