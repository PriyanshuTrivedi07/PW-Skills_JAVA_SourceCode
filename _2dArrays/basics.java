package _2dArrays;

// import java.util.*;

public class basics {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[][] arr = { { 2, 3, 2 },
                { 5, 7, 2 },
                { 3, 6, 2 } };
        // int arr[][] = new int[3][4];
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.printf("%d ",arr[i][j]);
        //     }
        //     System.out.printf("\n");
        // }
        PrintArray.print2DArray(arr);
    }
}
