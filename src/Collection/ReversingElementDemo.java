package Collection;
import java.util.*;

public class ReversingElementDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add(16);
        l.add(45);
        l.add(85);

        System.out.println("Before Reversing: "+l);

        Collections.reverse(l);

        System.out.println("After Reversing: "+l);

    }
}
