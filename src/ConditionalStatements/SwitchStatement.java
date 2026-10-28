package ConditionalStatements;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Course ID:");
        int courseID = sc.nextInt();

        switch (courseID){
            case 1:
                System.out.println("Computer Engineering");
                System.out.println("Course Fee = 150000");
                System.out.println("Duration: 12 Months");
                break;
            case 2:
                System.out.println("Information Technology");
                System.out.println("Course Fee = 145000");
                System.out.println("Duration: 12 Months");
                break;
            case 3:
                System.out.println("ENTC");
                System.out.println("Course Fee = 105000");
                System.out.println("Duration: 8 Months");
                break;
            case 4:
                System.out.println("Civil");
                System.out.println("Course Fee = 95000");
                System.out.println("Duration: 10 Months");
                break;
            case 5:
                System.out.println("Chemical");
                System.out.println("Course Fee = 90000");
                System.out.println("Duration: 5 Months");
                break;
            default:
                System.out.println("Invalid Course ID");
        }
    }
}
