package Operators;

import java.util.Scanner;

public class OperatorsPractice {
    Scanner sc = new Scanner(System.in);
    String employyeName;
    double basicSalary;
    double hra;
    double da;
    int experience;
    double performanceRating;
    double healthInsurance;
    double grossSalary;
    double performanceBonus;
    double experienceBonus;
    double insuranceBonus;
    double taxAmount;
    double netSalary;
    double totalSalary;

    void getDetails(){
        System.out.println("Employee Name: ");
        employyeName = sc.nextLine();
        System.out.println("Basic Pay: ");
        basicSalary = sc.nextDouble();
        System.out.println("Enter Experience: ");
        experience = sc.nextInt();
        System.out.println("Your Performance Rating: ");
        performanceRating = sc.nextDouble();
    }

    void hra(){
        hra = (basicSalary>75000)?(0.10*basicSalary)
                :(basicSalary>45000)?(0.05*basicSalary)
                :(basicSalary>15000)?(0.02*basicSalary)
                :0;
    }

    void da(){
        da = (basicSalary>75000)?(0.05*basicSalary)
                :(basicSalary>50000)?(0.03*basicSalary)
                :(basicSalary>20000)?(0.02*basicSalary)
                :0;

    }
    void grossSalary(){
        grossSalary = basicSalary+hra+da;
    }

    void performanceBonus(){
        performanceBonus = (performanceRating>4.5)?(0.10*grossSalary)
                :(performanceRating>=3.5)?(0.05*grossSalary)
                :(performanceRating>=2.5)?(0.02*grossSalary)
                : 0;
    }

    void experienceBonus(){
        experienceBonus = (experience>=10)?(0.10*grossSalary)
                :(experience>=5)?(0.05*grossSalary)
                :0;
    }

    void healthInsurance(){
        insuranceBonus = (basicSalary>1500000)?(0.10*basicSalary)
                :(basicSalary>1000000)?(0.05*basicSalary)
                 :(basicSalary>750000)?(0.02*basicSalary)
                :0;
    }

    void taxonSalary(){
        totalSalary  = (grossSalary+performanceBonus+experienceBonus);
    }

    void taxCalculation(){
        taxAmount = (totalSalary>=2400000)? (totalSalary*0.30)
                :(totalSalary>1200000 && totalSalary<2400000)?(totalSalary*0.15)
                :(totalSalary>800000 && totalSalary<1200000)? (totalSalary*0.08)
                :0;
    }

    void calculate(){
        System.out.println("Employee Name & Salary Statistics: ");
        System.out.println("Employee name: "+employyeName);
        System.out.println("Basic Pay: "+basicSalary );
        System.out.println("HRA : "+hra);
        System.out.println("DA: "+da);
        System.out.println("Gross Pay: "+grossSalary);
        System.out.println("Performance Bonus: "+performanceBonus);
        System.out.println("Experience Bonus : "+experienceBonus);
        System.out.println("Total Pay: "+totalSalary);
        System.out.println("Tax Amount : "+taxAmount);
        System.out.println("Insurance Amount : "+insuranceBonus);

        netSalary = (grossSalary+performanceBonus+experienceBonus+ insuranceBonus)-taxAmount;
        System.out.println();
        System.out.println("Net Salary : "+netSalary);
    }

    public static void main(String[] args) {
        OperatorsPractice op = new OperatorsPractice();
       // op.getDetails();
        op.employyeName = "Ashutosh";
        op.basicSalary  = 1560450;
        op.experience = 6;
        op.performanceRating = 4.6;
        op.hra();
        op.da();
        op.grossSalary();
        op.performanceBonus();
        op.experienceBonus();
        op.healthInsurance();
        op.taxonSalary();
        op.taxCalculation();
        op.calculate();
    }


}
