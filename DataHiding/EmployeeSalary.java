package DataHiding;

class Employee{
    private int empID;
    private String empName;
    private int empSalary;

    void setEmpInfo(int id, String name, int salary){
        empID =id;
        empName = name;
        empSalary = salary;
    }

    void getEmpInfo(){
        System.out.println("Emp ID:" +empID);
        System.out.println("Emp Name: "+empName);
        System.out.println("Emp Salary: "+empSalary);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee obj =  new Employee();
        obj.setEmpInfo(5510,"Ashutosh",225560);
        obj.getEmpInfo();
    }
}
