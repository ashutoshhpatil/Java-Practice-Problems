package Java8.Streams;

import java.util. *;
import java.util.stream.Collectors;

class Employee{
    private int id;
     private String name;
    private int salary;

    Employee(int id,String name,int salary){
        this.id=id;
        this.name =name;
        this.salary =salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class StreamsDemo {
    public static void main(String[] args) {
        List <Employee> l = new ArrayList<>();
        l.add(new Employee(111,"Ashutosh",100000));
        l.add(new Employee(112,"Shay",200000));
        l.add(new Employee(113,"Ravi",300000));
        l.add(new Employee(114,"Durga",400000));
        l.add(new Employee(115,"Kishan",500000));

        /// Write a program to print the name of the employees whose name starting with "L";

        /// By using normal loop
        for(int i=0;i<l.size();i++){
            if(l.get(i).getName().startsWith("D")){
                System.out.println(l.get(i).getName());
            }
        }

        /// By using Streams

        l.stream()
                .filter(r->r.getName().startsWith("D"))
                .forEach(t->System.out.println(t.getName()));

        /// Write a program to collect empnames into separate list from Employee List

        List <String> empList = l.stream().map(t->t.getName()).collect(Collectors.toList());
        System.out.println(empList);

        /// Write a program to find out the max salary

        System.out.println(l.stream().max((t1,t2)-> Integer.compare(t1.getSalary(),t2.getSalary())).get().getSalary());   ///this approach onyl prints the salary but not the name and salary simultaneously

        /// Write a program to print min salary
        System.out.println(l.stream().min((t1,t2)->(t1.getSalary()<t2.getSalary()?-1:(t1==t2)?0:1)).get().getSalary());

        ///To print the name and salary together we can use the following approach:

        Employee e = l.stream().max((t1,t2)-> Integer.compare(t1.getSalary(),t2.getSalary())).get();

        System.out.println("Highest Salary Employee Name: "+e.getName());
        System.out.println("Highest Salary: "+e.getSalary());

        /// Similar for Lowest Salary:

        Employee E = l.stream().min((t1,t2)-> Integer.compare(t1.getSalary(),t2.getSalary())).get();
        System.out.println("Lowest Salary Employee Name: "+E.getName());
        System.out.println("Lowest Salary: "+E.getSalary());


        /// Write a program to print the second highest and lowest salary:

        //Second Highest
        l.stream().sorted((e1,e2)
                ->Integer.compare(e2.getSalary(),e1.getSalary()))
                .limit(2)
                .skip(1)
                .forEach((p)-> System.out.println("Second Highest Salary: Name: "+p.getName() + "; salary :" + p.getSalary()));

        // Second Lowest
        l.stream().sorted((e1,e2)
                ->Integer.compare(e1.getSalary(),e2.getSalary()))
                .limit(2)
                .skip(1)
                .forEach((p)-> System.out.println("Second Lowest Salary: Name: "+p.getName() + "; Salary :" + p.getSalary()));

    }

}
