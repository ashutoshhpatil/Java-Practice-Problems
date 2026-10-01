package Strings;

public class MethodsStringBuilder {
    public static void main(String[] args) {

        // Initialize a new StringBuilder
        StringBuilder sb = new StringBuilder("Ashutosh");

 // 1. Inspecting Capacity and Length

        //length() Returns the number of characters currently in the builder.
        System.out.println(sb.length()); // Output: 8

        //capacity() Returns the current allocated memory capacity (initial length + 16 by default).
        System.out.println(sb.capacity()); // Output: 24


 // 2. Adding and Inserting Text (These modify the original object)

        //append(String) Adds text to the very end of the sequence.
        System.out.println(sb.append(" Java")); // Output: Ashutosh Java

        //insert(index, String) Pushes new text into the sequence at a specific index.
        System.out.println(sb.insert(8, " Pro")); // Output: Ashutosh Pro Java


 // 3. Modifying and Deleting Text (These modify the original object)

        //replace(start, end, String) Swaps out a chunk of text from start up to (but not including) end.
        System.out.println(sb.replace(9, 12, "Dev")); // Output: Ashutosh Dev Java

        //delete(start, end) Removes a chunk of text from start up to (but not including) end.
        System.out.println(sb.delete(9, 13)); // Output: Ashutosh Java

        //deleteCharAt(index) Removes one single character at the exact index.
        System.out.println(sb.deleteCharAt(8)); // Output: AshutoshJava

        //reverse() Flips the entire character sequence backward.
        System.out.println(sb.reverse()); // Output: avaJhsotuhsA


        // Let's reverse it back to normal so the next examples make sense!
        sb.reverse(); // Back to "AshutoshJava"


 // 4. Extracting Parts (These return a regular String/char, they do NOT modify the StringBuilder)

        //charAt(index) Returns the character at the specified index.
        System.out.println(sb.charAt(4)); // Output: t

        //substring(start) Extracts everything from the start index to the end as a new String.
        System.out.println(sb.substring(8)); // Output: Java

        //substring(start, end) Extracts from start up to (but not including) the end index as a new String.
        System.out.println(sb.substring(0, 4)); // Output: Ashu


 // 5. The Final Step: Converting back to an immutable String

        //toString() Converts the StringBuilder back into a standard, immutable String object.
        String finalResult = sb.toString();
        System.out.println(finalResult); // Output: AshutoshJava
    }
}