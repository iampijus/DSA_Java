package collections;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();

        adq.offer(10);
        adq.offer(45);
        adq.offerFirst(32);
        adq.offerLast(7);

        System.out.println(adq);

        System.out.println(adq.peek());

        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq);
        System.out.println(adq.pollFirst());
        System.out.println(adq);
        System.out.println(adq.pollLast());
        System.out.println(adq);


    }
}
