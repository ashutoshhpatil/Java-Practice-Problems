package Constructor;

class Payroll{
    int employeeId;
    String employeeName;
    String department;
    double basicSalary;
    double bonus;
    boolean isPermanent;

    Payroll(){
        this(1001,"Unknown","Geberal",30000,0,false);
    }

    Payroll(int employeeId){
        this(employeeId,"Unknown","Geberal",30000,0,false);
    }

    Payroll(int employeeId,String employeeName){
        this(employeeId,employeeName,"Geberal",30000,0,false);
    }

    Payroll(int employeeId,String employeeName, String department){
        this(employeeId,employeeName,department,30000,0,false);
    }

    Payroll(int employeeId,String employeeName, String department,double basicSalary){
        this(employeeId,employeeName,department,basicSalary,0,false);
    }

    Payroll(int employeeId,String employeeName, String department,double basicSalary,double bonus){
        this(employeeId,employeeName,department,basicSalary,bonus,false);
    }

    Payroll(int employeeId, String employeeName, String department, double basicSalary, double bonus, boolean isPermanent){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.department=department;
        this.basicSalary=basicSalary;
        this.bonus=bonus;
        this.isPermanent=isPermanent;
        
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Department: "+department);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Is Permanent: "+isPermanent);
    }
}

public class PayrollCO {
    public static void main(String[] args) {
        Payroll p1 = new Payroll();
        Payroll p2 = new Payroll(101);
        Payroll p3 = new Payroll(102, "Rahul");
        Payroll p4 = new Payroll(103, "Priya", "HR");
        Payroll p5 = new Payroll(104, "Aman", "IT", 60000);
        Payroll p6 = new Payroll(105, "Sneha", "Finance", 70000, 8000);
        Payroll p7 = new Payroll(106, "Karan", "Marketing", 75000, 10000, true);
    }
}
