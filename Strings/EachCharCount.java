//Count the occurrence of each character
package Strings;

public class EachCharCount {
    public static void main(String[] args) {

        String input = "abcdaabde";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int count = 0;

            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (input.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }

            // Count occurrence of current character
            for (int j = 0; j < input.length(); j++) {

                if (input.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);
        }
    }
}
