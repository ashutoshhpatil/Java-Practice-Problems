package ConditionalStatements;

import java.util.Scanner;

public class PracticeProblem {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Is going for Trek(true/false)");
            boolean planningTrek = sc.nextBoolean();

            if (planningTrek) {
                System.out.println("Who is driving the bike(A/B)");
                String bikeDriver = sc.next();

                if (bikeDriver.equals("A")) {
                    System.out.println("Bike Driver is A");
                    System.out.println("Petrol wii be paid by B");

                } else if (bikeDriver.equals("B")) {
                    System.out.println("Bike Driver is B");
                    System.out.println("Petrol will be paid 50-50");

                } else {
                    System.out.println("Invalid Choice");
                }
            } else {
                System.out.println("Plan Cancelled...No Trekking");
            }

        }
    }
}
