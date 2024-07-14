package Array;

public class swap {
    public static void main(String[] args) {
        int[] arr = {20, 30};
        Swap(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static void Swap(int arr[]){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

}
