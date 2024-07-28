// arrays.sort = 0(N log N)
// for loop = 0(N)
// TC = 0(N log N)
// SC = 0(N)

package Sorting;

import java.util.Arrays;

public class goodInteger {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 1, 9, 8, 0};
        int result = goodIntegerFinder(arr);
        System.out.println("Good Integer: " + result);
    }

    public static int goodIntegerFinder(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        int N = arr.length;
        for(int i = 0; i < N; i++){
            if(arr[i] == i) count ++;
        }
        return count;
    }
}
