package Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;

class Database{
    private String name;
    private int id;
    private int age;
    Database(String name,int id, int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public String toString(){
        return "Name is: "+ name+ " Id is : "+id+ " Age is: "+age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}

public class HashMapConversion {
    public static void main(String[] args) {

        List <Database> list = new ArrayList<>();
        list.add(new Database("karan",10,25));
        //list.add(new Database("Akash",10,21));
        list.add(new Database("Kapil",20,26));
        list.add(new Database("Amit",30,35));

        /// Write a program to convert the List into Map
        try {
            System.out.println(list.stream().collect(Collectors.toMap((p) -> p.getId(), p -> p)));
        } catch ( IllegalStateException e) {
            System.out.println("Duplicate Value is Present ...Change it ");
        }

    }
}
