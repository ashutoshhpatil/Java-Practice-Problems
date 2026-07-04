package Methods.Assignment1;

public class Employee {
    String empName;
    int empId;
    double salary;

    void displayEmployeeDetails(){
        System.out.println("Employee Details ");
    }
    void setEmployeeDetails(String empName,int empId){
        this.empName = empName;
        this.empId = empId;

        System.out.println("Employee Name: "+empName);
        System.out.println("Employee ID: "+empId);
    }

    double getSalary(double salary){
        this.salary = salary;
        System.out.println("Employee Salary: "+salary);
        return salary;
    }

    double getBonus(double salary, double bonus){
        bonus += salary;
        System.out.println("Salary after bonus: "+bonus);
        return bonus;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.displayEmployeeDetails();
        employee.setEmployeeDetails("Prakash Raj",2356);
        employee.getSalary(56500.5);
        employee.getBonus(56500.5,5000);
    }

}
