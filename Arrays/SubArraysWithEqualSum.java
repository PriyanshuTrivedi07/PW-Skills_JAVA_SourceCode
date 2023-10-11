package Arrays;

import java.util.*;

public class SubArraysWithEqualSum {
    static int findArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean equalSumPartition(int arr[]) {
        int totalSum = findArraySum(arr);
        int prefSum = 0, suffSum;
        for (int i = 0; i < arr.length; i++) {
            prefSum = prefSum + arr[i];
            suffSum = totalSum - prefSum;
            if(prefSum == suffSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        int arr[] = new int[size + 1];
        System.out.println("Enter " + size + " elements : ");
        // Array input (1-based indexing)
        for (int i = 1; i <= size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal partition possible : "+equalSumPartition(arr));
        // int sumofarr = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sumofarr = sumofarr + arr[i];
        // }
        // int[] prefArr = PrefixSum.prefixSumArray(arr); // prefix Sum Array
        // // int[] suffArr = SuffixSumArray.suffixSumArr(arr); // Suffix Sum Array

        // for (int i = 0; i < arr.length - 1; i++) {
        // // boolean flag = false;
        // if (prefArr[i] == (sumofarr - prefArr[i])) {
        // System.out.println("yes");
        // }
        // }

        sc.close();
    }
}
