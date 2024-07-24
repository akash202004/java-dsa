// Time Complexity : O(2^N)

package Recursion;

public class power {
    public static void main(String[] args) {
        int ans = pow(2,4);
        System.out.println(ans);

    }
    public static int pow(int a, int n){
        if(n == 0) return 1;
        if(n == 1) return a;

        int temp = pow(a, n-1);
        return temp * a;
    }

}

