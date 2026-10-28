package Strings;

public class InternMethod {
    public static void main(String[] args) {
        String s1 = new String("Cheatsheet");
        String s2 = "Cheatsheet";

        System.out.println(s1==s2); // false

        //intern() method
        String s3 = s1.intern();

        System.out.println(s3 == s2); // true
    }
}


// The intern() method is used to manually move a
// String object from the main Heap memory into the String Constant Pool.