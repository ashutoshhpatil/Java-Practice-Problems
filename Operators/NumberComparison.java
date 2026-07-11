package Operators;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2=sc.nextInt();

            if (num1 == num2) {
                System.out.println("Both Numbers are equal");
            }else if (num1>num2){
                System.out.println(num1+" is greater than "+num2);
            }else{
                System.out.println(num2+" is greater than "+num1);
            }

            }
        }
    }

