package PracticeSet1;

import java.util.Scanner;

public class SecurityDoorSystem {

    Scanner sc = new Scanner(System.in);
      int empID;
      int accessLevel;
      int PIN;

        void getDetails(){
            System.out.println("Enter Employee ID: ");
            empID = sc.nextInt();
            if(empID%2!=0){
                System.out.println("Incorrect Employee ID");
                return;
            }
            System.out.println("Enter Access Level: ");
            accessLevel = sc.nextInt();
            if(accessLevel<3){
                System.out.println("Access Level is Low");
                return;
            }
            System.out.println("Enter Correct PIN:");
            PIN = sc.nextInt();


    }

    void checkAccess(){

            if(PIN>=1000 && PIN<=9999){
            if(accessLevel>=3 && (empID%2)==0) {
                System.out.println("Access is Granted.... Welcome to Z World");
            }
            }else {
                System.out.println("Access Denied");
            }
    }

    public static void main(String[] args) {
        SecurityDoorSystem sds = new SecurityDoorSystem();
        sds.getDetails();
        sds.checkAccess();
    }
}
