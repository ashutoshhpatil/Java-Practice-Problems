package Java8;

import java.util.function.Supplier;

class CollegeStudent {
    String name;
    int rollNo;
    int marks;
    int age;

    CollegeStudent(String name,int rollNo,int marks,int age){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
        this.age=age;

        System.out.println("Name: "+name+ "\n" + "Roll No: "+rollNo+ "\n" + "Marks " +marks+ "\n" + "Age: "+age);
    }
}

interface College{
    public void getInfo(String name,int rollNo,int marks,int age);
}

public class ConstructorReferenceDemo2 {
    public static void main(String[] args) {
         College s = CollegeStudent::new;
         s.getInfo("Ashutosh",33,100,23);
    }
}
