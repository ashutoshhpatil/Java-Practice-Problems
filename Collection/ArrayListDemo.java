package Collection;

import java.util.*;

public class ArrayListDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add(19);
        list.add("P");
        list.add(2,"H");
        System.out.println(list);
        list.remove("A");
        System.out.println(list);
    }
}
