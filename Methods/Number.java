package Methods;

import java.util.Scanner;

public class Number {
    Scanner sc = new Scanner(System.in);

    void calc(){

        int num1 =sc.nextInt();
        int num2 = sc.nextInt();
        int max =0;
        if(num1>num2){
            max =num1;
        }
        else{
            max =num2;
        }

        System.out.println("The Largest number is:"+max);
    }
}

class M{
    public static void main(String[] args) {
        Number obj = new Number();
        obj.calc();
    }
}
