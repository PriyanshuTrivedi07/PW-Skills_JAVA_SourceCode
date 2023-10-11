package _2dArrays;

public class PrintArray {
    static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { //row
            for (int j = 0; j < arr[i].length; j++) { //column
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 2, 3},
                { 5, 7,},
                { 3, 6} };
        print2DArray(arr);
    }

}
