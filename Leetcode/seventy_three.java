package Leetcode;

import java.util.Scanner;

public class seventy_three {
    public static void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols = new boolean[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        for(int i=0; i<m; i++){
            if(zeroRows[i]){
                for(int j=0; j<n; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i=0; i<n; i++){
            if(zeroCols[i]){
                for(int j=0; j<m; j++){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printArray(int[][] matrix){
        for(int[] row: matrix){
            for(int elem: row){
                System.out.print(elem + "");
            }
            System.out.println();
        }
    }

    public void main(String[] args) {
        News news = new News();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        news.setZeroes(arr);
        printArray(arr);
    }
}
