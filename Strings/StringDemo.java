package Strings;

public class StringDemo {
    public static void main(String[] args) {

        String s1 ="Ashutosh";
        String s2 = new String(s1);
        System.out.println(s2);   // Ashutosh
        System.out.println(s1==s2);  //FALSE

        char [] s3 = {'A','S','H','U','T','O','S','H'};
        String s4 =new String(s3);
        System.out.println(s4);  //ASHUTOSH

    }
}
