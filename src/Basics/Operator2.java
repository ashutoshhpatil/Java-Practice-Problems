package Basics;

import java.util.Scanner;

public class Operator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();
        System.out.println("Enter Time Period:");
        int time = sc.nextInt();

        float interest = 14.5f;

        float simple_interest = (amount*time*interest/100);
        System.out.println("The Simple Interest is:" +simple_interest);


    }
}
