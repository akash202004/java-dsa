// Given a char[] which contains only small and capital letter toogle them
// uppercase -> lowercase
// lowercase -> uppercase
package String;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        char[] ch = new char[n];
        String st = scn.nextLine();

        for(int i = 0; i < n; i++){
            ch[i] = st.charAt(i);
        }
        Toogle(ch);

        for(char c: ch){
            System.out.print(c);
        }
    }
    public static void Toogle(char[] ch){
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 65 && ch[i] <= 90){
                ch[i] = (char)(ch[i] + 32);
            } else if(ch[i] >= 97 && ch[i] <= 122){
                ch[i] = (char)(ch[i] - 32);
            }
        }
    }
}
