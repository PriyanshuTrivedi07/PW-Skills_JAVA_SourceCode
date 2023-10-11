package Arrays;
import java.util.*;
public class PrefixSum {
    /* //Using an extra Array (Brute force Approach)
    static int[] prefixSumArray(int arr[]){
        int n = arr.length;
        int pref[] = new int[n];
        
        pref[0] = arr[0];
        for(int i=1;i<n;i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    } */

    //Without Using extra array (In Space) :
    static int[] prefixSumArray(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = { 4, 6, 3, 5, 8, 2 };
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

        // Calling and Printing Prefix Sum array :
        prefixSumArray(arr);
        System.out.print("Prefix Sum Array : ");
        SortArray0and1.printArray(arr);
        

        sc.close();
    }
}
