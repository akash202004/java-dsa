// Time Complexity : O(1)

package Recursion;

public class power2 {
    public static void main(String[] args) {
        int ans = pow(2,4);
        System.out.println(ans);

    }
    public static int pow(int a, int n){
        if(n == 0) return 1;
        if(n == 1) return a;

        int temp = pow(a, n/2);
        if(n%2 == 0){
            return temp*temp;
        } else{
            return temp*temp*a;
        }
    }

}

