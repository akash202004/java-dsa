package Leetcode;

public class News {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Boolean arrays to mark rows and columns that need to be zeroed
        boolean[] zeroRows = new boolean[m]; // All values initialized to false by default
        boolean[] zeroCols = new boolean[n]; // All values initialized to false by default

        // First pass to find all the rows and columns that have zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Second pass to set the rows to zero
        for (int i = 0; i < m; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Third pass to set the columns to zero
        for (int j = 0; j < n; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        News news = new News();

        int[][] matrix1 = {
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {1, 0, 0, 1}
        };
        news.setZeroes(matrix1);
        printMatrix(matrix1);

        int[][] matrix2 = {
                {0, 1, 2, 0},
                {3, 4, 0, 2},
                {1, 3, 1, 5}
        };
        news.setZeroes(matrix2);
//        printMatrix(matrix2);
    }
}
