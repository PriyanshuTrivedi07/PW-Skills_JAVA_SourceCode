package Sorting;
import java.util.Scanner;
public class InsertionSort {
    
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                // swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
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

        insertionSort(arr);

        System.out.println("After Sorting : ");
        printArray(arr);
        
        
        
        
        sc.close();
    }
}
