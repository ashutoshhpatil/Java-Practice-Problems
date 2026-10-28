package Java8;
import java.util.function.Consumer;

class Movie{
    String name;

    Movie(String name){
        this.name=name;
    }
}

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer < Movie > c1 = m-> System.out.println(m.name+ " Ready to Release");
        Consumer < Movie > c2  = m-> System.out.println(m.name+ " Released but a big flop");
        Consumer <Movie >  c3 = m-> System.out.println(m.name+ " movie Information storing in databases");

        ///Consumer chaining:
        Consumer <Movie> cc = c1.andThen(c2).andThen(c3);

        Movie m1 = new Movie("Spider");
        cc.accept(m1);
    }
}
