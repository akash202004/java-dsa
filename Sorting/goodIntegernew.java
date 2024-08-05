// arrays.sort = 0(N log N)
// for loop = 0(N)
// TC = 0(N log N)
// SC = 0(N)

package Sorting;

import java.util.Arrays;

public class goodIntegernew {
    public static void main(String[] args) {
        int arr[] = {-4, -2, 3, 3, 5, 5, 5, 5, 8, 8, 8, 10, 12};
        int result = goodIntegerFinder(arr);
        System.out.println("Good Integer for repetition element : " + result);
    }

    public static int goodIntegerFinder(int[] arr){
        Arrays.sort(arr);
        int lessCount = 0;
        int count = 0;
        int N = arr.length;
        for(int i = 1; i < N; i++){
            if(arr[i] != arr[i - 1]){
                lessCount++;
            }
            if(arr[i] == lessCount){
                count++;
            }
        }
        return count;
    }
}
