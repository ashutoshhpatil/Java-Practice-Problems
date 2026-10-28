package Java8.Streams;

import java.util. *;
import java.util.stream.Collectors;

public class DuplicateRemoval {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println("ArrayList as Inserted Original: "+l);

        /// Write a Program to remove the duplicate elements from the arraylist
        System.out.println("After Duplicates Removal");
        l.stream().distinct().forEach((n)-> System.out.print(n+ " "));
        System.out.println();

        /// Write a program to find the count of duplicate elements
        int duplicateElements = (int) (l.size() - l.stream().distinct().count());
        System.out.println("Duplicate Elements Count: "+duplicateElements);
    }
}
