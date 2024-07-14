package Patterns;

public class diamondInsideBox{
    public static void main(String[] args) {
        int n = 7;
        int nst= n/2 + 1;
        int nsp = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nst; j++){
                System.out.print("*");
            }
            for(int z = 1; z <= nsp; z++){
                System.out.print(" ");
            }
            for(int j = 1; j <= nst; j++){
                System.out.print("*");
            }
            if(i <= n/2){
                nst--;
                nsp+=2;
            } else {
                nst++;
                nsp-=2;
            }
            System.out.println("\n");
        }
        
    }
}