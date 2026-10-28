package Java8.FunctionalInterface;

@FunctionalInterface
interface Demo1 {
    public void m1();

    /// Any number of default and  static methods allowed inside this
    /// But only one Abstract Method allowed
}

class Test{
    public static void main(String[] args) {
        Demo1 i = ()-> System.out.println("Hello Java 8");
        i.m1();
    }
}



