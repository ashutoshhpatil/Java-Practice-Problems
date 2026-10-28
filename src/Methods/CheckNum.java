package Methods;

import java.util.Scanner;

public class CheckNum {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    void calc(){
        if(num>0){
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("zero");
        }
    }
}

class P{
    public static void main(String[] args) {
        CheckNum cn = new CheckNum();
        cn.calc();
    }
}