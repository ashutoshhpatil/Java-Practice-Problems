package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NaturalSortingExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Before Sorting: "+numbers);

        // Sorts in natural ascending order
        Collections.sort(numbers);

        System.out.println("After Sorting: "+numbers);
        // Output: [10, 20, 30, 40]
    }
}