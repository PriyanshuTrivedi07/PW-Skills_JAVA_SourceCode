package _2dArrays;

// Q: rotate a given square matrix 
import java.util.Scanner;

public class RotateMatrix {
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

    // To reverse the given array
    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // To rotate a given matrix
    static void rotateMatrix(int[][] arr, int r) {
        // To rotate a matrix 90 degree :
        // 1. transpose the matrix
        // 2. reverse the each row of transposed matrix;

        transposeInPlace(arr, r, r);
        for (int i = 0; i < r; i++) {
            reverseArray(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows of the square matrix : ");
        int r = sc.nextInt();
        int[][] arr = new int[r][r];
        System.out.printf("Enter a (%d x %d) matrix \n",r,r);
        for(int i = 0;i<r;i++){
            for(int j= 0;j<r;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original array : ");
        PrintArray.print2DArray(arr);
        System.out.println("After rotating 90(deg) the matrix becomes : ");
        rotateMatrix(arr, r);
        PrintArray.print2DArray(arr);

        sc.close();
    }
}
