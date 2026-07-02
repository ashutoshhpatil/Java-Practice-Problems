package Methods;

import java.util.Scanner;

public class Square {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    void calc(){
        int square = num * num;
        System.out.println("The Square is:" +square );
    }
}

class math{
    public static void main(String[] args) {
        Square obj  = new Square();
        obj.calc();
    }
}
