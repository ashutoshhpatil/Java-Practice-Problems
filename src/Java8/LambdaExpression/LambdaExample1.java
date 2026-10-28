package Java8.LambdaExpression;

import java.util.*;

class Employee{
    String name;
    int empId;

    Employee(String name,int id){
        this.name = name;
        this.empId = id;
    }

    public String toString(){
        return empId+":"+name;
    }
}

public class LambdaExample1 {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>();
        l.add(new Employee("Durga",10));
        l.add(new Employee("Ravi",20));
        l.add(new Employee("Akash",15));
        l.add(new Employee("Kumar",25));

        System.out.println("Before Sorting " +l);

        /// Here we are using Lambda Expression directly in place of Comparator
        Collections.sort(l,(e1,e2)->(e1.empId<e2.empId)?-1:(e1.empId>e2.empId)?1:0);
        System.out.println("After sorting based on ID" +l);

        Collections.sort(l,(e1,e2)->(e1.name.compareTo(e2.name)));
        System.out.println("After sorting based on Name" +l);

    }
}
