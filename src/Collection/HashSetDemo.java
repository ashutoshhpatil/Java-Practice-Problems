package Collection;

import java.util.HashSet;

public class HashSetDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("Z");
        h.add("X");
        h.add("null");
        h.add("1");
        h.add("5");

        System.out.println(h.add("E"));

        System.out.println(h);

    }
}


// The insertion happens according to HashCode