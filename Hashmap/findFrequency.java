package Hashmap;

import java.util.HashMap;

public class findFrequency {
    void printFrequency(int arr[], int queries[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) == true) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (int j = 0; j < queries.length; j++) {
            int val = queries[j];
            if (hm.containsKey(val) == true) {
                System.out.println(val + " : " + hm.get(val));
            } else {
                System.out.println(val + " : 0");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,3,5,6,11,6,5,1,2};
        int[] queries = {1,2,5,29};

        findFrequency ff = new findFrequency();
        ff.printFrequency(arr, queries);
    }
}
