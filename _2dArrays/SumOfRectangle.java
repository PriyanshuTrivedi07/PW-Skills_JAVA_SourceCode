package _2dArrays;

import java.util.Scanner;

public class SumOfRectangle {
    // Method 1 : Traversing from given first coordinate to given last coordinate
    // (Brute force approach)
    static int findRectangleSum1(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Function to find prefix Sum Array
    static void prefArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }

    // Function to find prefix sum matrix (In Place)
    static void prefixSumMatrix(int[][] matrix, int r, int c) {

        for (int i = 0; i < r; i++) {
            prefArray(matrix[i]);
        }
    }

    // Method 2 : Using PrefixSum Matrix (Optimised)
    static int findRectangleSum2(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            if (r1 > 0) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                sum += matrix[i][r2];
            }
        }
        return sum;
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

        System.out.println("Rectangle sum using First Method: " + findRectangleSum1(matrix, l1, r1, l2, r2));
        prefixSumMatrix(matrix, r, c);
        System.out.println("The prefix sum Matrix is : ");
        PrintArray.print2DArray(matrix);
        System.out.println("Rectangle sum using Second Method: " + findRectangleSum2(matrix, l1, r1, l2, r2));

        sc.close();
    }
}
