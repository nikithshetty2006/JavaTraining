package sets;

import java.util.HashSet;

public class Sets_sample {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        System.out.println(s);
        HashSet<Integer> s1 =new HashSet<>();
        s1.add(100);
        s1.add(200);
        s1.add(300);
        System.out.println(s1);
        s.addAll(s1);
        System.out.println(s);
        System.out.println(s.containsAll(s1));

    }
}
