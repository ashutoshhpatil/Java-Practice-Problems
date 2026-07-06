package Inheritance.Assignment1.MultilevelInheritance;

class Person{
    String personName = "Ashutosh";
    int age= 22;
    String gender = "Male";

    void dispPerson(){
        System.out.println("Student Name: "+personName);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}

class Student extends Person{
    int rollNo = 72239032;
    int m1 = 96;
    int m2 = 84;
    int m3 = 55;
    int m4 = 65;
    int m5  = 87;

    void getStudentData(){
        super.dispPerson();
        System.out.println("Roll No: "+rollNo);
        System.out.println("Marathi: "+m1);
        System.out.println("Hindi: "+m2);
        System.out.println("English: "+m3);
        System.out.println("Science: "+m4);
        System.out.println("Maths: "+m5);
    }
}

class Result extends  Student{
    float totalMarks;
    float percentage;

    void getDetails(){
        totalMarks = m1+m2+m3+m4+m5;

        percentage = ((totalMarks/500)*100);
    }

    void dispDetails(){
        super.getStudentData();
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Percentage: "+percentage);
    }
}
public class StudentData {
    public static void main(String[] args) {
Result obj = new Result();
obj.getDetails();
obj.dispDetails();
    }
}
