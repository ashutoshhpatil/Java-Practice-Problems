package ConditionalStatements;

import java.util.Scanner;

public class ifelseProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int marks  = sc.nextInt();

        if(marks>=60){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}
