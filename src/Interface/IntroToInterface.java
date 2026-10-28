package Interface;

interface InterDemo{
    int x =10;

    void start();

    void end();
}

abstract class ClassDemo implements  InterDemo{

    @Override
    public void start() {
        System.out.println("Start Method");
    }
}

class ClassDemo2 extends ClassDemo{
    @Override
    public void end() {
        System.out.println("End Method");
    }
}

public class IntroToInterface {
    public static void main(String[] args) {
        InterDemo obj = new ClassDemo2();
        System.out.println(InterDemo.x);
        obj.start();
        obj.end();
    }
}
