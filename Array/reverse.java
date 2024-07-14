package Array;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Reverse(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void Reverse(int arr[]) {
        int sp = 0;
        int lt = arr.length -1;
        while(sp<lt){
            int temp = arr[sp];
            arr[sp] = arr[lt];
            arr[lt] = temp;
            sp++;
            lt--;
        }
    }
}
