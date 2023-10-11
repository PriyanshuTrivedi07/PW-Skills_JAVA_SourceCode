package Sorting;

import java.util.Scanner;

public class SelectionSort {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void selectionSorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            // find the index of the smallest element from unsorted part of array
            int min = arr[i];
            int idx = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    idx = j;
                }
            }

            // swap minimum value with its respective index
            if (idx != i) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.printf("Enter %d elements : \n", n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting : ");
        printArray(arr);

        selectionSorting(arr);

        System.out.println("After Sorting : ");
        printArray(arr);

        sc.close();
    }
}
