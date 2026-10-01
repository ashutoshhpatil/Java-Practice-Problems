package Strings;

public class MethodsStrings {
    public static void main(String[] args) {

        System.out.println('a');
 // 1. Inspecting a String
        String str = "Ashutosh";
        String str2 = " ";

        //length(): Returns the total number of characters in the string.
        System.out.println(str.length()); // Output: 8

        //isEmpty() : Returns true if the length is 0.
        System.out.println(str.isEmpty()); // Output: false

        //isBlank() Returns true if empty or only contains white spaces.
        System.out.println(str2.isBlank()); // Output: true

 // 2. Extracting Parts of String

        //charAt(index) Returns the character at the specified index (starts at 0).
        System.out.println(str.charAt(4)); // Output: t

        //substring(start) Extracts everything from the start index to the end.
        System.out.println(str.substring(0)); // Output: Ashutosh

        //substring(start, end) Extracts from the start index up to (but not including) the end index.
        System.out.println(str.substring(4,8)); // Output: tosh


 // 3. Searching inside a String

        //indexOf(String) Returns the starting index of the first occurrence of the text (-1 if not found).
        System.out.println(str.indexOf("s")); // Output: 1

        //lastIndexOf(String) Returns the starting index of the last occurrence of the text.
        System.out.println(str.lastIndexOf("h")); // Output: 7

        //contains(String) Returns true if the exact sequence of characters exists inside the string.
        System.out.println(str.contains("shu")); // Output: true

        //startsWith(String) Returns true if the string begins with the specified prefix.
        System.out.println(str.startsWith("Ash")); // Output: true

        //endsWith(String) Returns true if the string ends with the specified suffix.
        System.out.println(str.endsWith("tosh")); // Output: true


 // 4. Comparing Strings
        String str3 = "ashutosh";

        //equals(String) Returns true if both strings have the exact same characters and casing.
        System.out.println(str.equals(str3)); // Output: false

        //equalsIgnoreCase(String) Returns true if both strings match, ignoring uppercase/lowercase differences.
        System.out.println(str.equalsIgnoreCase(str3)); // Output: true


 // 5. Modifying/Formatting a String
        String str4 = "   Hello Ashutosh   ";
        String csv = "Apple,Banana,Mango";

        //toLowerCase() Converts every character in the string to lowercase.
        System.out.println(str.toLowerCase()); // Output: ashutosh

        //toUpperCase() Converts every character in the string to uppercase.
        System.out.println(str.toUpperCase()); // Output: ASHUTOSH

        //trim() Removes extra spaces from the very beginning and very end of the string.
        System.out.println(str4.trim()); // Output: Hello Ashutosh

        //replace(old, new) Swaps all occurrences of a specific character or sequence with a new one.
        System.out.println(str.replace('A', 'O')); // Output: Oshutosh

        //split(regex) Chops the string into an array of strings based on a delimiter.
        String[] fruits = csv.split(",");
        System.out.println(fruits[0]); // Output: Apple
        System.out.println(fruits[1]); // Output: Banana

        //toCharArray() Converts the entire string into a standard array of characters.
        char[] charArray = str.toCharArray();
        System.out.println(charArray[0]); // Output: A
    }
}