package Strings;

public class StringConstructor {
    public static void main(String[] args) {

        char ch[] =new char[]{'j','a','v','a'};
        String s1 = new String(ch);
        System.out.println(s1);  //java

        byte b[]= new byte[]{97,98,99,100};
        String s2 = new String(b);
        System.out.println(s2);  //abcd

    }

}

 