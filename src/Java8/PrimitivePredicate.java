package Java8;
import java.util.function.*;
public class PrimitivePredicate {
        public static void main(String[] args) {

            // IntPredicate
            IntPredicate p1 = n -> n > 10;
            System.out.println(p1.test(15));  // true

            // LongPredicate
            LongPredicate p2 = n -> n > 100L;
            System.out.println(p2.test(50L)); // false

            // DoublePredicate
            DoublePredicate p3 = n -> n > 5.5;
            System.out.println(p3.test(7.2)); // true
        }
    }

