package Lists;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println(v.capacity());
        System.out.println(v.size());

        v.add(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(50);
        System.out.println(v);
        Vector<Integer> v1 = new Vector<>();
        v1.addElement(100);
        v1.addElement(200);
        v1.addElement(300);
        System.out.println(v1);
        v.addAll(v1);
        v.insertElementAt(1000,1);
        System.out.println(v);
        v.remove(2);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
    }
}
