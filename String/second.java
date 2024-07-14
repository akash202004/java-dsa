// reverse a string
package String;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        char[] ch = s.toCharArray();

        int start = 0;
        int end = len - 1;
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start ++;
            end --;
        }

        String ans = s.valueOf(ch);
        System.out.println(ans);
    }
}
