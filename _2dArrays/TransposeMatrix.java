package _2dArrays;

import java.util.*;

public class TransposeMatrix {
    // TRANSPOSE USING ANOTHER MATRIX :
    // static int[][] findTranspose(int[][] arr,int r, int c){
    // int[][] trans = new int[c][r]; //transposed matrix
    // for(int i=0;i<c;i++){
    // for(int j=0;j<r;j++){
    // trans[i][j] = arr[j][i];
    // }
    // }
    // return trans;
    // }

    // TRANSPOSE IN PLACE : useful in case of square matrix
    static void transposeInPlace(int[][] arr, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.printf("Enter (%d x %d) matrix : \n", r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // int[][] ans = findTranspose(arr, r, c);
        // System.out.println("Tranpose of matrix : ");
        // PrintArray.print2DArray(ans);

        System.out.println("Transposed Matrix : ");
        transposeInPlace(arr, r, c);
        PrintArray.print2DArray(arr);

        sc.close();
    }
}
