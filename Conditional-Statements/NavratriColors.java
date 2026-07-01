package ConditionalStatements;

import java.util.Scanner;

public class NavratriColors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Navratri Day:");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Day 1: White");
                break;
            case 2:
                System.out.println("Day 2: Red");
                break;
            case 3:
                System.out.println("Day 3: Royal Blue");
                break;
            case 4:
                System.out.println("Day 4: Yellow");
                break;
            case 5:
                System.out.println("Day 5: Green");
                break;
            case 6:
                System.out.println("Day 6: Grey");
                break;
            case 7:
                System.out.println("Day 7: Orange");
                break;
            case 8:
                System.out.println("Day 8: Pink");
                break;
            case 9:
                System.out.println("Day 9: Purple");
                break;
            default:
                System.out.println("Invalid Day");
    
        }
    }
}
