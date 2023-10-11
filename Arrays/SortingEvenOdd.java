package Arrays;

import java.util.*;

public class SortingEvenOdd {
    static void sortEvenOdd(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                SortArray0and1.swapValues(arr, left, right);
                left++;
                right--;
            }
            if (arr[left]%2 == 0) {
                left++;
            }
            if (arr[right]%2 != 0) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = { 4, 6, 3, 5, 8, 2 };
        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements consisting 0 and 1s only : ");
        // Array input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array : ");
        SortArray0and1.printArray(arr);
        sortEvenOdd(arr);
        System.out.print("\nSorted Array : ");
        SortArray0and1.printArray(arr);

        sc.close();
    }
}
