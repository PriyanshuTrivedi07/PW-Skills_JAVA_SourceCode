package _2dArrays;

import java.util.*;

public class SpiralMatrix {
    static void printSpiralOrder(int[][] matrix, int r , int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalelement = 0;
        while(totalelement < r*c){
            //top row -> leftcol to rightcol
            for(int j=leftCol;j<=rightCol && totalelement < r*c;j++){
                System.out.print(matrix[topRow][j] + " ");
                totalelement++;
            }
            topRow++;

            // right col -> topRow to bottomRow 
            for(int i=topRow;i<=bottomRow && totalelement < r*c;i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalelement++;
            }
            rightCol--;

            // bottom row -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol && totalelement < r*c;j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalelement++;
            }
            bottomRow--;
            
            // leftcol -> bottomRow to topRow
            for(int i=bottomRow;i>=topRow && totalelement < r*c;i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalelement++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows & columns of your matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.printf("Enter (%d x %d) matrix : \n",r,c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printSpiralOrder(arr, r, c);
        sc.close();
    }
}
