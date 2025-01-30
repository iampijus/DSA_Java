package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(120);
        pq.offer(95);
        pq.offer(51);

        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
