package Hashmap;

import java.util.HashMap;

public class firstNonRepeating {
    void firstNonRep(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) == true) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(hm.get(arr[i]) == 1){
                System.out.println("First non repeating element : " + arr[i]);
            return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,3,5,6,11,6,5,1,2};

        firstNonRepeating ff = new firstNonRepeating();
        ff.firstNonRep(arr);
    }
}
