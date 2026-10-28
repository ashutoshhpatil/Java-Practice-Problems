package Collection;

import java.util.*;

public class CustomizedSortingExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(5);
        list.add(25);
        list.add(10);

        System.out.println("Before Sorting: "+list);

        // Pass the Comparator implementation to Collections.sort
        Collections.sort(list, new DescendingComparator());

        System.out.println("After Sorting: "+list); // Output: [25, 15, 10, 5]
    }
}

// Custom Comparator for Descending Order
class DescendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // Return positive if o1 < o2 (places o2 before o1)
        // Return negative if o1 > o2 (places o1 before o2)
        // Return 0 if o1 == o2
        return o2.compareTo(o1);
    }
}