package Collection;
import java.util.*;

public class CollectionConstructorDemo {
    public static void main(String[] args) {
        List<String> rawTags = List.of("java", "python", "java", "cpp", "python");

        // Removes duplicates in a single line

        // HashSet uniqueTags = new HashSet(Collection c)

        HashSet<String> uniqueTags = new HashSet<>(rawTags);     // This constructor is used in every Collection the main purpose is Inter-conversion between collection objects

        System.out.println(uniqueTags); // Output: [java, cpp, python] (order may vary)
    }
}
