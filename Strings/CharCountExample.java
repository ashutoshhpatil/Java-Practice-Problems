// Count the occurrence of a single character
package Strings;

public class CharCountExample {

    public static void main(String[] args) {

        String input = "abcdcdbrabaa";
        int count = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Count of 'a' = " + count);
    }
}
