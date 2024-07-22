package Recursion;

public class printIncreasing {
    public static void main(String[] args) {
        sum(5);
    }

    public static void sum(int N){
        if(N == 1) {
            System.out.println(N);
            return;
        }

        sum(N-1);
        System.out.println(N);

    }

}

