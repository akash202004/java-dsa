package Hashmap;

import java.util.HashMap;

public class uniqueElement {
    int distinctElement(int arr[]){
    HashMap<Integer, Integer> hm = new HashMap<>();
    for(int i = 0; i < arr.length; i++){
        hm.put(arr[i], 1);
    }
    return hm.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,3,5,6,11,6,5,1,2};
        uniqueElement obj = new uniqueElement();
        int uniqueCount =  obj.distinctElement(arr);
        System.out.println("Number of unique elements: " + uniqueCount);
    }
}
