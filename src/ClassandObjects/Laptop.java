package ClassandObjects;

import java.util.Scanner;

public class Laptop {
    Scanner sc = new Scanner(System.in);
    String brand = sc.nextLine();
    String name = sc.nextLine();
    int Ram = sc.nextInt();

    void dispSpecifications(){
        System.out.println("Laptop Company: "+brand);
        System.out.println("Laptop Name: "+name);
        System.out.println("Laptop Ram: "+Ram);

        if(Ram>16){
            System.out.println("Suitable for Programming and Gaming");
        }
        else{
            System.out.println("Not Suitable for Gaming");
        }
    }

    public static void main(String[] args) {
        Laptop lp = new Laptop();
        lp.dispSpecifications();
    }
}
