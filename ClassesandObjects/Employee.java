package ClassandObjects;

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);

    String empName = sc.nextLine();
    double baseSalary = sc.nextDouble();
    int bonus = 15000;
    double netSalary = baseSalary + bonus;

    void calculateNetSalary(){

        System.out.println("The Net Salary of employee "+empName+ " is " +netSalary);
    }

    void displayDetails(){
        System.out.println("Base Salary: "+baseSalary);
        System.out.println("Bonus: " +bonus);
        System.out.println("Net Salary = (Base Salary + Bonus): "+netSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayDetails();
        emp.calculateNetSalary();

    }
}
