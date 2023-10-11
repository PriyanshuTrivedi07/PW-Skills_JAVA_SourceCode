package Arrays;

import java.util.*;

public class SuffixSumArray {
    // Without Using extra array (In Space) :
    static int[] suffixSumArr(int[] arr) {
        int n = arr.length;
        for (int i = n-2;i>=0;i--) {
            arr[i] = arr[i] + arr[i + 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements : ");
        // Array input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Printing Original Array :
        System.out.print("Original Array : ");
        SortArray0and1.printArray(arr);

        // Calling and Printing Suffix Sum array :
        suffixSumArr(arr);
        System.out.print("Suffix Sum Array : ");
        SortArray0and1.printArray(arr);

        sc.close();
    }
}
