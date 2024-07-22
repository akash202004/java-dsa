package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);

    }
    public static int sum(int N){
        if(N == 0) return 0;
        if(N == 1) return 1;

        int temp1 = sum(N-1);
        int temp2 = sum(N-2);

        return temp1 + temp2;
    }

}

