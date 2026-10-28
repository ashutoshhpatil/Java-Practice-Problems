/// Predicate Joining Example

package Java8;
import java.util.function. *;

public class PredicateJoiningDemo {
    public static void main(String[] args) {
        int []x={0,5,6,10,15,16,25,32,40};

        Predicate<Integer> p1 = i-> i>=10;
        Predicate<Integer> p2 = i-> i%2==0;
        System.out.println("The numbers which are even and greater than 10");

        for(int x1: x){
            if(p1.or(p2).test(x1)){
                System.out.println(x1);
            }
        }
    }
}


/// .negate() => It reverses the result of a predicate, meaning true becomes false and false becomes true.