public class diamondPattern{
    public static void main(String[] args) {
        int n = 5;
        int nst= 1;
        int nsp = n/2;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nsp; j++){
                System.out.print(" ");
            }
            for(int z = 1; z <= nst; z++){
                System.out.print("*");
            }
            System.out.println("\n");
            if(i <= n/2){
                nsp--;
                nst+=2;
            } else {
                nsp++;
                nst-=2;
            }
        }
        
    }
}