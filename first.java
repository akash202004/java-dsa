import java.util.Scanner;

public class first{
    public static void main(String args[]){
        // float f = 2.3f;
        // double d = f;
        // Long a = 100000000000L;
        // System.out.println(a);
        // System.out.println(d);
        // int a = 100000;
        // int b = 100000;
        // long c = a*b;
        // // System.out.println(c);
        // System.out.println(16/3);
        // System.out.println(25.0/3);
        // System.out.println(35%9);

        // Scanner sc = new Scanner(System.in);
        // int ak = sc.nextInt();

        // if(ak%2 == 0) System.out.println("Even");
        // else System.out.println("Odd");

        Scanner abc = new Scanner(System.in);
        int n = abc.nextInt();
        int factorialCount = 0;

        // factorial of n -->
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                // System.out.println(i);
            }
        }
        
        // Prime Number or not -->
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                factorialCount++;
            }
        }
        if(factorialCount == 2){
            System.out.println("It is a Prime Number : " + n);
        } else if(n <= 1){
            System.out.println("Not a prime Number :" + n);
        } else { 
            System.out.println("Not a prime Number :" + n);
        }


    }
}