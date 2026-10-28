package Java8.FunctionalInterface;

@FunctionalInterface
public interface Demo3 {
    public void squareIt(float n);
}

class Test3{
    public static void main(String[] args) {
        Demo3 i = (n)-> System.out.println("Square of "+n+ " is "+ n*n);
        i.squareIt(5);
        i.squareIt(10.5f);
    }
}
