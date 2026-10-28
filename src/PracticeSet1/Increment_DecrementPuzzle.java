package PracticeSet1;

public class Increment_DecrementPuzzle {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(++a + b-- - --a + ++b);  //41
        System.out.println(a++ + --b + ++a - b--);
        System.out.println(++a + ++b - a-- + --b);
        System.out.println(++a + --b + a++ - b-- + ++a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}