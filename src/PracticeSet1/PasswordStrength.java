package PracticeSet1;

import java.util.Scanner;

public class PasswordStrength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        int password = sc.nextInt();

        int firstDigit = (password/1000);  //4
        int secondDigit = (password/100)%10;   // 5
        int thirdDigit = (password/10)%10;    //4
        int fourthDigit = (password%10);      //5
        int sum = fourthDigit+secondDigit+thirdDigit+fourthDigit;

        if(firstDigit != fourthDigit && sum>20 && password%5 != 0){
                System.out.println("-->Strong Password");
        }
        else {
                    System.out.println("Same Digits Repeated");
                if(sum<20){
                    System.out.println("Sum Issue");
                }
                if(password%5==0){
                    System.out.println("Divisible by 5");
                }

                System.out.println("-->Weak Password");
            }
        }
    }