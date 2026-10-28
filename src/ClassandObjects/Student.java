package ClassandObjects;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);

    String name = sc.nextLine();
    int rollNo = sc.nextInt();
    int marks = sc.nextInt();

    void dispInfo(){
        System.out.println("The name of the Student is: "+name);
        System.out.println("The roll no of the student is: " +rollNo);
        System.out.println("The marks of the student is "+marks);
    }

    void calculate(){
        if(marks > 75)
            System.out.println("Grade A");
        else if(marks > 50 && marks < 75)
            System.out.println("Grade B");
        else
            System.out.println("Failed");
    }

    public static void main(String[] args) {
        Student ss = new Student();
        ss.dispInfo();
        ss.calculate();
    }
}
