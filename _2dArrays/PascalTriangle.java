package _2dArrays;

import java.util.Scanner;

public class PascalTriangle {
    static int[][] pascal(int r) {
        int[][] ans = new int[r][];
        for (int i = 0; i < r; i++) {
            // Since , ith row has i+1 columns then ,
            // ans[0] = new int[0+1];
            // ans[1] = new int[1+1];
            // ans[2] = new int[2+1];
            ans[i] = new int[i+1];
            for (int j = 0; j < i + 1; j++) {
                // 1st and last element of every row is 1
                if (j == 0 || i == j) {
                    ans[i][j] = 1;
                } else {
                    ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();

        int[][] ans = pascal(r);
        PrintArray.print2DArray(ans);

        sc.close();
    }
}
