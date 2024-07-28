// Order or Removal

package Sorting;

import java.util.Arrays;

public class orderOfRemoval {
    public static void main(String[] args) {
        int arr[] = {4, 6, 2, 7};
        int result = orderSum(arr);
        System.out.println("Result : " + result);
    }

    public static int orderSum(int[] arr){
        Arrays.sort(arr);
        int N = arr.length;
        int ans = 0;
        for(int i = 0; i < N; i++){
            int temp = arr[i] * (N-i);
            ans += temp;
        }
        return ans;
    }
}
