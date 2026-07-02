package Methods;

import java.util.Scanner;

public class Factorial {
    Scanner sc = new Scanner(System.in);
    int  n =sc.nextInt();
    int fact =1;
    void Calc(){
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        System.out.println(fact);
    }
}

class F{
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.Calc();
    }
}
