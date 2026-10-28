package Collection;

import java.util.TreeSet;

public class TreeSetDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("C");
        ///t.add(new Integer(10));  CCE will arise if used this

        /// t.add(null);   NPE will arise if used this

        System.out.println(t);
    }
}
