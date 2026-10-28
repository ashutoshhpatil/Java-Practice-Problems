package Java8.Streams;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Employ{
    private int id;
    private String name;
    private int salary;

    Employ(int id,String name,int salary){
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

public class GroupBy {
    public static void main(String[] args) {
            List<Employee> l = new ArrayList<>();
            l.add(new Employee(111,"Ashutosh",100000));
            l.add(new Employee(112,"Ashutosh",200000));
            l.add(new Employee(113,"Ravi",300000));
            l.add(new Employee(114,"Durga",400000));
            l.add(new Employee(115,"Kishan",500000));
        l.add(new Employee(116,"Durga",600000));

            /// Write a Program for grouping and then counting the number

        System.out.println(l.stream().collect(Collectors.groupingBy((p)->p.getName(),Collectors.counting())));

        /// Write a program to find the average of
        /// Concept of Statistical Method: summarizingInt(), summarizingDouble() ....


        IntSummaryStatistics d = l.stream().collect(Collectors.summarizingInt((p)->p.getSalary()));
        System.out.println(d);
        System.out.println("Average "+d.getAverage());
        System.out.println("Max:"+d.getMax());
        System.out.println("Min: "+d.getMin());
        System.out.println("Count "+d.getCount());
        System.out.println("Sum"+ d.getSum());
        System.out.println("Class "+d.getClass());   //Class class java.util.IntSummaryStatistics

        }
}
