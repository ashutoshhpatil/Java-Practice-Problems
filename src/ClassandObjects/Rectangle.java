package ClassandObjects;

import java.util.Scanner;

public class Rectangle {
    Scanner sc = new Scanner(System.in);

    void area(){
        System.out.println("Enter length:");
        int length = sc.nextInt();
        System.out.println("Enter width:");
        int width = sc.nextInt();
        int result = length*width;
        System.out.println("The Area is "+ result);

        if(length == width)
            System.out.println("Rectangle is Square");
        else
            System.out.println("Rectangle is not square");
    }

    public static void main(String[] args) {
        Rectangle rr = new Rectangle();
        rr.area();
    }
}
