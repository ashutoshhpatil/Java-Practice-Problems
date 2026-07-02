package Methods;

import java.util.Scanner;

public class Even_Odd {
    Scanner sc = new Scanner(System.in);
    void Calc(){
        while(true){
            int num = sc.nextInt();
            if(num % 2 ==0){
                System.out.println("Even Number");
            }
            else{
                System.out.println("Odd Number");
            }
        }
    }
}

class N {
    public static void main(String[] args) {
        Even_Odd obj = new Even_Odd();
        obj.Calc();
    }
}