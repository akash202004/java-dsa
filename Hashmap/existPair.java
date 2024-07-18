package Hashmap;

import java.util.HashMap;

public class existPair {
    boolean pairElem(int arr[], int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(hm.containsKey(arr[i])){
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for(int i = 0; i < arr.length; i++){
            int a = arr[i];
            int b = k - a;
            if(a != b && hm.containsKey(b)){
                return true;
            } else if(a == b && hm.containsKey(b) && hm.get(b) > 1){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 5, 6, 11, 6, 5, 1, 2};
        int k = 17;
        existPair obj = new existPair();
        boolean exists = obj.pairElem(arr, k);
        System.out.println("Does a pair exist -> " + exists);
    }
}
