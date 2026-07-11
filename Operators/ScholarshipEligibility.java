package Operators;

import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks>80){
            double familyIncome = sc.nextDouble();
            if(familyIncome<=800000){
                System.out.println("Elgible for Schloarship");
            }
        }else {
            System.out.println("Not eligible");
        }
    }
}
