package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        queue.offer(12);
        queue.offer(23);
        queue.offer(51);

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
