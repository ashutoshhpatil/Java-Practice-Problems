package ConditionalStatements;

import java.util.Scanner;

public class TrafficSignalSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Signal:");
        String color = sc.next();
        System.out.println("Is button Pressed:");
        boolean pedestrianButton=sc.nextBoolean();


        switch(color){
            case "Red":
                System.out.println("For how many seconds:");
                int secondPressed = sc.nextInt();
                System.out.println("Red");
                System.out.println("Stop");
                if(pedestrianButton){
                    System.out.println("Pedestrians can cross");
                    if(secondPressed>=10){
                        System.out.println("Pedestrian time exceeded");
                    }
                }
                break;

            case "Yellow":
                System.out.println("Yellow");
                System.out.println("Slow Down");
                System.out.println("Pedestrians must not cross");
                if(pedestrianButton){
                    System.out.println("Wait for the Red Signal");
                }
                break;

            case "Green":
                System.out.println("Green");
                System.out.println("Go");
                if(pedestrianButton){
                    System.out.println("Do not cross... Wait for Red Signal");
                }break;

            default:
                System.out.println("Invalid");
        }
    }
}
