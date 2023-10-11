package _2dArrays;

import java.util.Scanner;

public class SumOfRectangleOptimised {
    // function to make the given matrix to the prefixSum matrix in both rows and
    // columns
    static void prefixMatrixBothRowAndCol(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // traverse horizontally to calculae row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        // traverse vertically to calculae column-wise prefix sum
        for (int j = 0; j < c; j++) { // fixing column
            for (int i = 1; i < r; i++) { // traversing
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    static int findRectangleSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int totalsum = 0, leftSum = 0, upSum = 0, leftupSum = 0;
        prefixMatrixBothRowAndCol(matrix);

        totalsum = matrix[l2][r2];
        if (r1 > 0) {
            leftSum = matrix[l2][r1 - 1];
        }
        if (l1 > 0) {
            upSum = matrix[l1 - 1][r2];
        }
        if (l1 > 0 && r1 > 0) {
            leftupSum = matrix[l1 - 1][r1 - 1];
        }

        int ansSum = totalsum - leftSum - upSum + leftupSum;
        return ansSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns of your matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.printf("Enter a (%d x %d) matrix : \n", r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter co-ordinate (l1 r1) (l2 r2) : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        // findRectangleSum(matrix, l1, r1, l2, r2);
        System.out.println("the sum is : " + findRectangleSum(matrix, l1, r1, l2, r2));
        sc.close();
    }
}
