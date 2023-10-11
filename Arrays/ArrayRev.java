package Arrays;

import java.util.Scanner;

public class ArrayRev {
    /* // Reversing the array by traverse original array in reverse direction
    static int[] reverseArray(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;

        // traversing the original array in reverse direction and assigning the value in
        // result array

        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    // */

    // Reversing the array 'In place'
    static void reverseArrayInPlace(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            // swap arr[i] and arr[(arr.length-1)-i]
            int temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }
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

        // int[] ans = reverseArray(arr);
        // for(int i=0;i<ans.length;i++){
        // System.out.print(ans[i]+" ");
        // }
        System.out.println("Your Array before reversing : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        reverseArrayInPlace(arr);
        System.out.println("\nYour Array after reversing : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
