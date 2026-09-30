package Maps;

import java.util.HashMap;

public class Sample1 {
    public static void main(String[] args){
        HashMap<Integer, Integer>map=new HashMap<>();
        map.put(10,1);
        map.put(20,1);
        System.out.println(map);
        map.put(30,7);
        map.put(40,1);
        map.put(50,2);
        map.put(60,4);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
