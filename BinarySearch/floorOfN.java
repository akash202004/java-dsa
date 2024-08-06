package BinarySearch;

public class floorOfN {
    public static void main(String[] args) {
        int arr[] = {-4, 3, 4, 7, 10, 11, 12, 15, 19};
        int k = 8;
        int ans = floorN(arr, k);
        System.out.println("Floor of N is " + ans);
    }

    public static int floorN(int[] arr, int k){
        int low = 0;
        int high = arr.length - 1;
        int ans = 0;
        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == k){
                return arr[mid];
            } else if(arr[mid] > k){
                high = mid - 1;
            } else{
                low = mid + 1;
                ans = arr[mid];
            }

        }
        return ans;
    }
}
