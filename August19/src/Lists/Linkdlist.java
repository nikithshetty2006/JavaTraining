package Lists;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Linkdlist {
    public static void main(String[] args) {
        LinkedList<Object>l=new LinkedList<>();
        System.out.println(l);
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        l.addFirst(100);
        l.addLast(200);
        System.out.println(l);
        System.out.println(l.getLast());
        System.out.println(l.getFirst());
        l.removeFirst();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
    }
}
