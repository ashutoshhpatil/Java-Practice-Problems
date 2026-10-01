package Strings;

public class IntroToStringBuffer {

    StringBuffer firstName = new StringBuffer("Ashutosh");

    StringBuffer lastName = new StringBuffer("Patil");

    void dispInfo(){
       StringBuffer name =firstName.append(" "+ lastName);
        System.out.println("Name: "+name);
    }

    public static void main(String[] args) {
        IntroToStringBuffer sb = new IntroToStringBuffer();
        sb.dispInfo();
    }

}
