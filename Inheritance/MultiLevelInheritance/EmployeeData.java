package Inheritance.Assignment1.MultilevelInheritance;

class Employee{
    String empID;
    String empName;

    void dispEmp(){
        System.out.println("Employee ID: "+empID);
        System.out.println("Employee Name: "+empName);
    }
}

class Developer extends Employee{
    int basicSalary;
    String Department;
    int grossSalary;
    int hra;
    int da;

    void getData(){
        grossSalary =  basicSalary+hra+da;
    }

    void dispDeveloper(){
        super.dispEmp();
        System.out.println("Department: "+Department);
        System.out.println("Base Salary: "+basicSalary);
        System.out.println("Gross Salary: "+grossSalary);
    }
}

class SeniorDeveloper extends Developer{
    int bonusAmount;
    int totalSalary;

    void getDataSD(){
        if(grossSalary >= 500000){
            totalSalary = grossSalary+bonusAmount;
        }else {
            totalSalary = grossSalary;
        }
    }

    void dispSeniorDev(){
        super.dispDeveloper();
        System.out.println("Bonus Amount: "+bonusAmount);
        System.out.println("Total Salary: "+totalSalary);
    }
}

public class EmployeeData {
    public static void main(String[] args) {
        SeniorDeveloper sd = new SeniorDeveloper();
        sd.empName = "Ashutosh";
        sd.empID = "G54201245";
        sd.basicSalary = 890450;
        sd.Department = "Aerospace Development";
        sd.hra = 50000;
        sd.da = 12500;
        sd.bonusAmount = 25000;

        sd.getData();
        sd.getDataSD();
        sd.dispSeniorDev();

    }
}
