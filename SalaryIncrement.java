package Operators;

public class SalaryIncrement {
    double salary;
    double increment=0.10;

    void incrementSalary(double salary){
        this.salary=salary;
        System.out.println("Initial salary: "+salary);
        salary += (salary*increment);
        System.out.println("Salary after increment: "+salary);
    }

    public static void main(String[] args) {
        SalaryIncrement obj = new SalaryIncrement();
        obj.incrementSalary(85560.95);
    }
}

