package Collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})

    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        System.out.println(q.peek());  ///null
        //System.out.println(q.element());   ///NoSuchElementException

        for(int i=0;i<10;i++){
            q.offer(i);
        }

        System.out.println(q);     /// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(q.peek());   /// 0
        System.out.println(q);    /// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
