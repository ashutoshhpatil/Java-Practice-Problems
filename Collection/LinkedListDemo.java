package Collection;
import java.util.*;

public class LinkedListDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Durga");
        ll.add("SoftTech");
        ll.add("Solutions");
        System.out.println(ll);  //[Durga, SoftTech, Solutions]

        ll.remove("SoftTech");
        System.out.println(ll);  //[Durga, Solutions]

        ll.set(0,"Durga Infotech");
        System.out.println(ll);   //[Durga Infotech, Solutions]

        ll.addFirst("Java");
        System.out.println(ll);  //[Java, Durga Infotech, Solutions]

    }
}
