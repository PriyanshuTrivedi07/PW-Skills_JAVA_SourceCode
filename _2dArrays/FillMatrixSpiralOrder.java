package _2dArrays;
import java.util.*;
public class FillMatrixSpiralOrder {
    static int[][] generateSpiralMatrix(int n){
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
        int currEle = 1;
        while(currEle <= n*n){
            //top row -> leftcol to rightcol
            for(int j=leftCol;j<=rightCol && currEle <= n*n;j++){
                matrix[topRow][j] = currEle++;
            }
            topRow++;

            // right col -> topRow to bottomRow 
            for(int i=topRow;i<=bottomRow && currEle <= n*n;i++){
                matrix[i][rightCol] = currEle++;
            }
            rightCol--;

            // bottom row -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol && currEle <= n*n;j--){
                matrix[bottomRow][j] = currEle++;
            }
            bottomRow--;
            
            // leftcol -> bottomRow to topRow
            for(int i=bottomRow;i>=topRow && currEle <= n*n;i--){
                matrix[i][leftCol] = currEle++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive Integer : ");
        int n = sc.nextInt();


        int[][] matrix = generateSpiralMatrix(n);
        System.out.printf("the matrix with 1 to %d elements in spiral order is : \n",n*n);
        PrintArray.print2DArray(matrix);
        
        
        
        
        sc.close();
    }
}
