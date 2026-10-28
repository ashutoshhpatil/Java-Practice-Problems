package PracticeSet1;

import java.util.Scanner;

public class AuthenticationSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        int userID = sc.nextInt();

        System.out.print("Enter Password: ");
        int password = sc.nextInt();

        System.out.print("Enter Security Code: ");
        int securityCode = sc.nextInt();

        int lastDigitPassword = password % 10;

        int firstDigitSecurity = securityCode;
        while (firstDigitSecurity >= 10) {
            firstDigitSecurity /= 10;
        }

        boolean validUserID = userID % 7 == 0;
        boolean validPasswordLength = password >= 10000 && password <= 99999;
        boolean validDigitMatch = lastDigitPassword == firstDigitSecurity;
        boolean validSecurityCode = securityCode % 2 != 0;
        boolean validPasswordRule = password % 10 != 0;

        if (validUserID &&
                validPasswordLength &&
                validDigitMatch &&
                validSecurityCode &&
                validPasswordRule) {

            System.out.println("Login Successful");

        } else {

            if (!validUserID) {
                System.out.println("User ID is not divisible by 7");
            }

            if (!validPasswordLength) {
                System.out.println("Password is not a 5-digit number");
            }

            if (!validDigitMatch) {
                System.out.println("Password last digit does not match Security Code first digit");
            }

            if (!validSecurityCode) {
                System.out.println("Security Code is not odd");
            }

            if (!validPasswordRule) {
                System.out.println("Password is divisible by 10");
            }

            System.out.println("Login Failed");
        }

        sc.close();
    }
}