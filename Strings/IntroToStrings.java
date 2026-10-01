package Strings;

public class IntroToStrings {

    String name= "Ashutosh";  // Only one object is created on the SCP area
    String collegeName = "SKN College of Engineering";
    String location = "Pune";
    String degree = "Bachelor of Engineering";

    void dispInfo(){
        System.out.println("Name: "+name);
        System.out.println("College Name: "+collegeName);
        System.out.println("Location: "+location);
        System.out.println("Degree Name: "+degree);
    }

    public static void main(String[] args) {
        IntroToStrings obj = new IntroToStrings();
        obj.dispInfo();
    }
}
