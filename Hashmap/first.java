package Hashmap;

import java.util.HashMap;

public class first {
    public static void main(String[] args) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        hm.put(1, 2);
        hm.put(2, 3);
        hm.put(3, 4);
        hm.put(4, 5);
        hm.put(5, 6);
        System.out.println(hm.get(2));
        System.out.println(hm.containsKey(2));
        hm.remove(2);
        System.out.println(hm.containsKey(2));
        // for printing key
        for(int val: hm.keySet()){
            System.out.println("Key : " + val);
        }
        // for printing values
        for(int val: hm.values()){
            System.out.println("Value : " + val);
        }
    }
}
