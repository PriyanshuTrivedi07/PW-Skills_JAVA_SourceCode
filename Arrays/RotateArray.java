package Arrays;

// Q :- Rotate the given array by given 'k' steps, where k is non-negative number ;
import java.util.*;

public class RotateArray {
    // static void rotateArray(int arr[],int k){
    // int len = arr.length;
    // if(k%len==0){
    // return;
    // }
    // else{

    // }
    // }

    /*
     * static int[] rotateArray(int arr[], int k) { //using extra array ('ans')
     * int n = arr.length;
     * k = k % n;
     * int ans[] = new int[n];
     * int j = 0;
     * for (int i = n - k; i < n; i++) {
     * ans[j++] = arr[i];
     * }
     * 
     * for (int i = 0; i < n - k; i++) {
     * ans[j++] = arr[i];
     * }
     * return ans;
     * }
     */

    static void reverseArrayInPlace(int arr[], int sIdx, int eIdx) {
        int i = sIdx;
        int j = eIdx;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateArrayInSpace(int arr[], int k) {
        int n = arr.length; // 7
        k = k % n; // 5
        reverseArrayInPlace(arr, 0, n - k - 1);
        reverseArrayInPlace(arr, n - k, n - 1);
        reverseArrayInPlace(arr, 0, n - 1);
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
        System.out.print("Enter the Number of rotation you want in the array : ");
        int k = sc.nextInt();

        System.out.println("Your Array before Rotating : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nYour Array after Rotating : ");
        rotateArrayInSpace(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
