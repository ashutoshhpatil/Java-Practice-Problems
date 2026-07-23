package DataHiding;

import java.util.Scanner;

class Locker{
    Scanner sc = new Scanner(System.in);
    private int pin;


    Locker(int initialPin){
        pin = initialPin;

    }

    void unlockPin(){
        System.out.println("Enter PIN to Unlock");
        int enteredPin = sc.nextInt();
        if(enteredPin == pin){
            System.out.println("Successfully Unlocked");

        }else {
            System.out.println("Incorrect Pin");
        }
    }

    void changePin(int newPin){
        System.out.println("Enter Current PIN");
        int currentPin = sc.nextInt();

        if(currentPin == pin){
            pin = newPin;
            System.out.println("PIN Changed Successfully");
        }else {
            System.out.println("Wrong PIN Entered");
        }
    }
}

public class SecureLocker {
    public static void main(String[] args) {
        Locker obj = new Locker(1234);
        obj.changePin(3564);
        obj.unlockPin();
    }
}
