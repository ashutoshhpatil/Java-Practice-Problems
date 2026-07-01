package ConditionalStatements;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int income = sc.nextInt();
        double tax;

        if(income<=250000){
            tax=0;
            System.out.println("Tax:"+tax);
        }
        else if(income<=500000){
            tax = (income-250000)*0.05;
            System.out.println("Tax"+tax);
        }
        else if(income<=1000000){
            tax = (250000*0.05)+(income-500000)*0.20;
            System.out.println("Tax"+tax);
        }
        else if (income>1000000){
            tax = (250000*0.05)+(500000*0.20)+(income-1000000)*0.30;
            System.out.println("Tax"+tax);
        }
        else {
            System.out.println("Invalid Amount");
        }
    }
}
