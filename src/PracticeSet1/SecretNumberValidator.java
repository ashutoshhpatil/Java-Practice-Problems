package PracticeSet1;
import java.util.*;
public class SecretNumberValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 Digit Number: ");
        int num = sc.nextInt();

        if(num<1000 || num>9999){
            System.out.println("Enter 4 Digit Number Only");
        }
        int firstNum = (num/1000);
        int secondNum = (num/100)%10;
        int thirdNum = (num/10)%10;
        int fourthNum = (num%10);

        int outerSum = firstNum+fourthNum;
        int innerSum = secondNum+thirdNum;

        if(outerSum == innerSum && num%2==0 && num%3==0){
            System.out.println("Secret Number");
        }else {
            if(outerSum != innerSum ){
                System.out.println("Outer Sum Mismatch ");
            }
            if (num%2!=0) {
                System.out.println("Number is not even");
            }
            if(num%3!=0){
                System.out.println("Number is not divisible by 3");
            }
            System.out.println("Not a Secret number");
        }
    }
}
