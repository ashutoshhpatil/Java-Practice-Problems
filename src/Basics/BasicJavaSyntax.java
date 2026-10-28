package Basics;

import java.util.Scanner;
class basicjava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your college:");
        String college = sc.nextLine();

        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("College:" +college);
    }
}

