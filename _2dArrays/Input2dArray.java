package _2dArrays;
import java.util.Scanner;
public class Input2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c]; //no. of rows (r) is compulsory to give here and no. of columns (c) are optional 
        System.out.printf("Enter a (%d X %d) array : \n",r,c);
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your 2D array is : ");
        PrintArray.print2DArray(arr);
        sc.close();
    }
}
