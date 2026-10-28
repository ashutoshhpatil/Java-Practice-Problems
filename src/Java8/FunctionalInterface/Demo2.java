package Java8.FunctionalInterface;

public interface Demo2 {
    public void add(int a,int b);
}

class Test1{
    public static void main(String[] args) {
        Demo2 i =(a,b)-> System.out.println("Addition is: "+(a+b));
        i.add(10,20);
        i.add(100,200);
        i.add(1000,2000);
    }
}
