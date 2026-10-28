package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SearchingElementDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("B");
        l.add("M");
        l.add("K");
        l.add("A");
        l.add("a");

        System.out.println(l);

        Collections.sort(l);

        System.out.println(l);

        System.out.println(Collections.binarySearch(l,"Z"));
        System.out.println(Collections.binarySearch(l,"J"));
    }
}
