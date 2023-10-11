package Sorting;

import java.util.*;

public class BubbleSort {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void sortArray(int arr[]){
        int n = arr.length; // size of array
        for(int i = 0; i < n - 1; i++){
            boolean flag = true; // let our array is sorted 
            for(int j = 0; j <= (n - 2)-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag == true){
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.printf("Enter %d elements : \n", n);
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting : ");
        printArray(arr);

        sortArray(arr);

        System.out.println("After Sorting : ");
        printArray(arr);

        sc.close();
    }
}
