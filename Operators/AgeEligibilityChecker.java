package Operators;

public class AgeEligibilityChecker {
    int age;

    void info(){
        if(age<=0){
            System.out.println("Please enter corret age");
        }else if(age>0 && age<=18){
            System.out.println("Teenager");
        } else if (age>18 && age<=45){
            System.out.println("Young");
        } else if (age>45 && age<=150){
            System.out.println("Adult");
        } else if (age>150) {
            System.out.println("Bhagwan");

        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        AgeEligibilityChecker obj = new AgeEligibilityChecker();
        obj.age = 160;
        System.out.println("Age: "+obj.age);
        obj.info();
    }

}
