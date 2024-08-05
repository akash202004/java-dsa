package BinarySearch;

import java.util.Arrays;

public class one {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 1, 3, 7, 9, 8};
        int k = 5;
        boolean ans = binartsrch(arr, k);
        System.out.println(ans);
    }
    public static boolean binartsrch(int[] arr, int k){
        Arrays.sort(arr);
        int First = 0;
        int Last = arr.length + 1;
        while(First <= Last){
            int mid = (First + Last) / 2;
            if(arr[mid] == k){
                return true;
            } else if(arr[mid] < k){
                First = mid + 1;
            } else{
                Last = mid - 1;
            }
        }
        return false;
    }
}
