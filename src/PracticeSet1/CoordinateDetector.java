package PracticeSet1;

import java.util.Scanner;

public class CoordinateDetector {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter X Coordinate:");
            int x = sc.nextInt();
            System.out.println("Enter Y Coordinate:");
            int y = sc.nextInt();
            if(x>0 && y>0){
                System.out.println("Quadrant 1");
            }
            else if(x<0 && y>0){
                System.out.println("Quadrant 2");
            }
            else if(x<0 && y<0){
                System.out.println("Quadrant 3");
            }
            else if(x>0 && y<0){
                System.out.println("Quadrant 4");
            }
            else if(x == 0 && y == 0){
                System.out.println("Origin");
            }else if (y == 0) {
                System.out.println("On X Axis");
            }
            else{
                System.out.println("On Y Axis");
            }
        }
    }
}
