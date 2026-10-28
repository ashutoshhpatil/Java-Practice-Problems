package Polymorphism.Overloading;

public class MainMethodOverloading {

    public static void main(String a){
        System.out.println("String Main Method");
    }

    public static void main(int a){
        System.out.println("Int Main Method");
    }

    public static void main(String args,int a){
        System.out.println("String - Int Main Method");
    }

    public static void main(String[] args) {
        System.out.println("Original Main Method");
        MainMethodOverloading obj = new MainMethodOverloading();
        obj.main("Ashutosh");
        obj.main(10);
        obj.main("Ashutosh",15);

    }


}
