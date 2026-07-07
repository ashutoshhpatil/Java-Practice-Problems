package Inheritance.HierarchicalInheritance;

class Employee{
    String empName;
    String empID;
    String cmpName;
    String Designation;
    float salary;
    float bonus ;
    float baseSalary;
}

class Developer extends Employee{
    int projectCompleted=15;

    void getDeveloper(){
        empName = "Ashutosh";
        empID = "G34I45";
        cmpName ="Google";
        Designation = "Developer";
        baseSalary = 55000;
        //bonus = 0.10f;

        if(projectCompleted>5){
            bonus = 0.15f;
            salary = baseSalary+(baseSalary*bonus);
        }else {
            bonus = 0.05f;
            salary = baseSalary+(baseSalary*bonus);
        }
    }

    void dispDeveloper(){
        System.out.println("Employee Name: "+empName );
        System.out.println("Employee ID: "+empID );
        System.out.println("Company Name: "+cmpName );
        System.out.println("Designation: "+Designation);
        System.out.println("Bonus "+bonus);
        System.out.println("Total Salary: "+salary);
    }
}

class Tester extends Employee{
    int bugsFound = 190;

    void getTester(){
        empName = "Akshta";
        empID = "G34I46";
        cmpName ="Google";
        Designation = "Tester";
        baseSalary = 40000;
        if(bugsFound>100){
            bonus=15000;
            salary =  (baseSalary+bonus);
        }else {
            bonus = 5000;
            salary =  (baseSalary+bonus);
        }
    }
    void dispTester(){
        System.out.println("Employee Name: "+empName );
        System.out.println("Employee ID: "+empID );
        System.out.println("Company Name: "+cmpName );
        System.out.println("Designation: "+Designation);
        System.out.println("Bonus "+bonus);
        System.out.println("Total Salary: "+salary);
    }

}
public class SalaryBonusData {
    public static void main(String[] args) {
        Developer dd = new Developer();
        dd.getDeveloper();
        dd.dispDeveloper();

        System.out.println("=========");

        Tester tt = new Tester();
        tt.getTester();
        tt.dispTester();

    }
}
