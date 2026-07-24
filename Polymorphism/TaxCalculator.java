package Polymorphism.Overloading;

public class TaxCalculator {
    String taxPayerName;
    float annualIncome;
    float businessIncome;
    int capitalGain;
    float taxSlab;
    float taxAmount;
    String financialYear;

    void calcTax(int annualSalary){
        taxPayerName = "Aditya";
        taxSlab = 0.12f;
        taxAmount = taxSlab*annualSalary;
        annualIncome = annualSalary-taxAmount;

        System.out.println("Salary: "+annualSalary);
        System.out.println("Tax AMount: "+taxAmount);
        System.out.println("Annual Income: "+annualIncome);
        System.out.println("Financial Year: "+(financialYear = "2024-25"));
    }

    void calcTax(int salary,int hra){
        taxPayerName = "Sanyukta";
        taxSlab = 0.15f;
        taxAmount = taxSlab*(salary+hra);
        annualIncome = salary+hra-taxAmount;

        System.out.println("Salary: "+salary);
        System.out.println("HRA: "+hra);
        System.out.println("Tax Amount: "+taxAmount);
        System.out.println("Annual Income: "+annualIncome);
        System.out.println("Financial Year: "+(financialYear = "2025-26"));
    }

    void calcTax( float businessIncome,  int  capitalGain){
        taxPayerName = "Ashutosh";
        taxSlab = 0.30f;
        taxAmount = taxSlab*(businessIncome+capitalGain);
        annualIncome = businessIncome+capitalGain-taxAmount;

        System.out.println("Business Income: "+ businessIncome);
        System.out.println("Capital Gain: "+capitalGain);
        System.out.println("Tax Amount: "+taxAmount);
        System.out.println("Annual Income: "+annualIncome);
        System.out.println("Financial Year: "+(financialYear = "2026-27"));

    }
}

class Client{
    public static void main(String[] args) {
        TaxCalculator obj = new TaxCalculator();
        obj.calcTax(1225500);
        System.out.println("----------------------");
        obj.calcTax(1500000,85000);
        System.out.println("----------------------");
        obj.calcTax(7585650.2f,1200000);
    }
}
