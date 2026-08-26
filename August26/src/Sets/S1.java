package Sets;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class S1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer>s= new LinkedHashSet<>();
        s.add(10);
        s.add(20);
        System.out.println(s);

        TreeSet<Integer>t=new TreeSet<>();
        t.add(51);
        t.add(60);
        t.add(70);
        t.add(80);
        System.out.println(t);

        System.out.println(t.first());
        System.out.println(t.last());

        System.out.println(t.headSet(20));
        System.out.println(t.tailSet(20));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());

        System.out.println(t.subSet(2,60));
        System.out.println(t);

        System.out.println(t.higher(51));
        System.out.println(t);
    }
}
