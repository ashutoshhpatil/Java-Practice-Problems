package Operators;

import java.util.Scanner;

public class SimpleCalculator {
    Scanner sc = new Scanner(System.in);
    int var1 = sc.nextInt();
    int var2 = sc.nextInt();

    void addition(){
        int result1  = var1 + var2;
        System.out.println("Addition: "+result1);
    }
    void subtraction(){
        int result2 = Math.abs(var1-var2);
        System.out.println("Subtraction: "+result2);
    }

    void multiplication(){
        int result3 = var1*var2;
        System.out.println("Multiplication: "+result3);

    }
    void division(){
        int result4;
        if(var1>var2){
            result4 = var1/var2;
        }
        else{
            result4 = var2/var1;
        }

        System.out.println("Division: "+result4);
    }

    void modulo(){
        int result5 = var1%var2;
        System.out.println("Remainder: "+result5);
    }

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.addition();
        simpleCalculator.subtraction();
        simpleCalculator.multiplication();
        simpleCalculator.division();
        simpleCalculator.modulo();
    }



}
