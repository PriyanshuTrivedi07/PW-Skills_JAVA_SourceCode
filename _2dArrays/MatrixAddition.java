package _2dArrays;
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int c = sc.nextInt();

        // To add two matrices , the no. of rows & columns should be same of both matrices
        int arr1[][] = new int[r][c]; //first matrix
        int arr2[][] = new int[r][c]; //second matrix

        //taking first matrix input
        System.out.printf("Enter first (%d X %d) Matrix : \n",r,c);
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        //taking second matrix input
        System.out.printf("Enter second (%d X %d) Matrix : \n",r,c);
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        
        int sumArr[][] = new int[r][c]; //answer matrix will also have the same no. of rows & columns
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                sumArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("The addition matrix is : ");
        PrintArray.print2DArray(sumArr);
        
        
        
        
        sc.close();
    }
}
