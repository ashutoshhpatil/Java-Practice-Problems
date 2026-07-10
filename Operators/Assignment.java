package Operators.Types;

public class Assignment {
    public static void main(String[] args) {
        int a = 50;

        System.out.println(a=+5); //5
        System.out.println(a+=5); //10
        System.out.println(a-=5); //5
        System.out.println(a*=5); //25
        System.out.println(a/=5); //5
        System.out.println(a%=5); //0

        System.out.println(a);  //0
    }
}
