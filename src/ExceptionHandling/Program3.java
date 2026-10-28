package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        try {
            System.out.println("Enter Number");
             num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");
        }
    }
}
