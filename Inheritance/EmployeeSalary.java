package Inheritance.MultilevelInheritance;

class Company{
    float basicPay;
    float hra;
    float da;
     float totalSalary;
    float bonus;

    void calcSalary(){
        hra = (hra*basicPay);
        da = (da*basicPay);

        bonus = (bonus*basicPay);

        totalSalary =  basicPay+hra+da+bonus ;
    }

    void dispEmp(){
        System.out.println("Employee Basic Pay : "+basicPay);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+totalSalary);
    }
}

class ManagingDirector extends  Company{
    void getInfo(){
        basicPay = 225460;
        hra = 0.10f;
        da = 0.07f;
        bonus = 0.25f;

        calcSalary();
        dispEmp();
    }
}

class SeniorEngineer extends Company{
    void getInfo(){
        basicPay = 155000;
        hra = 0.07f;
        da = 0.05f;
        bonus = 0.20f;

        calcSalary();
        dispEmp();
    }
}

class JuniorEngineer extends Company{
    void getInfo(){
        basicPay = 85000;
        hra = 0.04f;
        da = 0.02f;
        bonus = 0.05f;

        calcSalary();
        dispEmp();
    }
}

class TraineeEngineer extends Company{
    void getInfo(){
        basicPay = 45550;
        hra =0.03f;
        da = 0.015f;
        bonus=0f;

        calcSalary();
        dispEmp();
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
      ManagingDirector md = new ManagingDirector();
      md.getInfo();
        System.out.println("=============================");

      SeniorEngineer se = new SeniorEngineer();
      se.getInfo();
        System.out.println("=============================");

      JuniorEngineer je = new JuniorEngineer();
      je.getInfo();
        System.out.println("=============================");

      TraineeEngineer te = new TraineeEngineer();
      te.getInfo();
        System.out.println("=============================");
    }
}
