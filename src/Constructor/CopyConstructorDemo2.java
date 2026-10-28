package Constructor;

class Staff{
    String empName;
    int empId;
    String designation;
    static  int salary;

    Staff(String e,int id,String d){
        empName =e;
        empId =id;
        designation=d;
    }

    Staff(Staff s){
        empName =s.empName;
        empId =s.empId;
        designation =s.designation;
    }

    void display(){
        System.out.println(empName);
        System.out.println(empId);
        System.out.println(designation);
        System.out.println(salary);
    }

}

public class CopyConstructorDemo2 {
    public static void main(String[] args) {
        Staff s1 =new Staff("Ashutosh",1256,"Team Lead");

        Staff s2 = new Staff(s1);
        Staff.salary = 456821;

        s1.display();
        System.out.println("--------------------------------------");
        s2.display();
    }
}
