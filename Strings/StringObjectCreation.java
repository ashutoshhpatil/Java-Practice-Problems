package Strings;

public class StringObjectCreation {
    public static void main(String[] args) {

        String str1 = "Ashutosh"; // Only One Object is created on SCP Area

        String str2 = new String("Patil");  // Two Objects are created on HEAP and SCP area



        System.out.println("First Name: "+str1);
        System.out.println("Last Name: "+str2);

    }
}
