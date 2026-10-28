package ConditionalStatements;

import java.util.Scanner;

public class if_elif_elseProgram {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Marks: ");
            int marks = sc.nextInt();

            if (marks >= 90 && marks <= 100)
                System.out.println("Merit marks");
            else if (marks >= 75 && marks < 90)
                System.out.println("First Class With Distinction");
            else if (marks >= 60 && marks < 75)
                System.out.println("Passed with First Class");
            else if (marks >= 35 && marks < 60)
                System.out.println("Passed with Second Class");
            else if (marks < 35)
                System.out.println("Failed");
            else
                System.out.println("enter correct marks");
        }
    }

}