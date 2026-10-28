package Operators.Types;

public class Arithmatic {
    public static void main(String[] args) {
        int a = 22;
        int b = 10;

        int c = a+b;
        System.out.println("Addition: "+c);

        int d = Math.abs(a-b);
        System.out.println("Subtraction: "+d);

        int e = a*b;
        System.out.println("Multiplication: "+e);

        double f =(double) a/b;
        System.out.println("Division: "+f);

        int g = a%b;
        System.out.println("Remainder: "+g);
    }
}
