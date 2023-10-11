package _2dArrays;

import java.util.Scanner;

public class MatrixMultiplication {
    static void matrixMultiplication(int a[][], int r, int c, int b[][], int n, int p) {
        if (c != n) {
            System.out.println("Invalid Matrices for Multiplication");
            return;
        }
        int[][] mult = new int[r][p]; // answer matrix

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < c; k++) {
                    mult[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("On multiplying above two matrices , we get : ");
        PrintArray.print2DArray(mult);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking first matrix input
        System.out.print("Enter no. of rows & columns of first Matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.printf("Enter first (%d X %d) Matrix : \n", r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // taking second matrix input
        System.out.print("Enter no. of rows & columns of second Matrix : ");
        int n = sc.nextInt();
        int p = sc.nextInt();
        int b[][] = new int[n][p];
        System.out.printf("Enter first (%d X %d) Matrix : \n", n, p);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        matrixMultiplication(a, r, c, b, n, p);
        sc.close();
    }
}
