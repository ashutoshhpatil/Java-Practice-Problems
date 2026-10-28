package Basics;
import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pi = 3.14f;
        System.out.println("Enter Length:");
        float length = sc.nextInt();
        System.out.println("Enter Width:");
        float width = sc.nextInt();

        float area = length*width;
        System.out.println("The Area is:" +area);

    }
}
