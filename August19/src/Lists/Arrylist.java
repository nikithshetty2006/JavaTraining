package Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arrylist {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        System.out.println(a);
        a.add("mumbai");
        a.add("nitte");
        System.out.println(a);
        a.add(1, "hyd");
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
        System.out.println(a.indexOf("nitte"));
        System.out.println(a.size());
        //number of elements in list currently
        //capacity = is how many ele it can hold
        //add(value)
        //add(index,value);
        //remove(index);
        //get(index);
        //set(index,value);
        //indexof(value);
        //lastindexof(value);
        //subList(fromIndex,toIndex);
        //isEmpty();
        //size();
        //contains(value);
        //clear();
        //a.clear();
        //System.out.println(a);
        a.add("sam");
        a.add("vivek");
        a.add("vinith");
        System.out.println(a);
        System.out.println("elements of list:" + a);
        System.out.println("using for loop");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println("usuing for each");
        System.out.println("using iterator interface");
        Iterator<String> i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("original order");
        ListIterator<String> x = a.listIterator();
        while (x.hasNext()) {

            System.out.println(i.next());
        }
    }


}
