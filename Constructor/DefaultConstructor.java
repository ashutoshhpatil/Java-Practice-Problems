package Constructor;

class Employee{
    String empName;
    String cmpName;

    //default constructor
    void getInfo(){
        empName = "Ashutosh";
        cmpName = "Microsoft";

        System.out.println("Employee Name: "+empName);
        System.out.println("Company Name: "+cmpName);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Employee employee = new Employee(); // default constructor called
        employee.getInfo();
    }
}
