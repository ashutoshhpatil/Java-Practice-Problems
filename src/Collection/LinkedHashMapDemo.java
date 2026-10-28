package Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        LinkedHashMap lm = new LinkedHashMap();
        lm.put("Ashutosh",100);
        lm.put("Akhil", 200);
        lm.put("Durga",300);
        lm.put("Aditya",400);

        System.out.println(lm);
    }
}
