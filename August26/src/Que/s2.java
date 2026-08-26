package Que;

import java.util.*;

public class s2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>(20);
        p.offer(10);
        p.offer(20);
        p.offer(30);
        System.out.println(p);

        System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println(p.element());
        System.out.println(p);

        System.out.println(p.remove(20));
        System.out.println(p);
        System.out.println(p.contains(1));

        Deque<Integer> d=new ArrayDeque<>();

        d.offer(10);
        d.offerFirst(20);
        d.offerFirst(30);
        d.offer(35);
        System.out.println(d);
        System.out.println(d.pollFirst());
        System.out.println(d.pollLast());
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    }
}
