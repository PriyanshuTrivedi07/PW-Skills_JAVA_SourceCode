package Arrays;

import java.util.*;

// Q:- find the maximum element from the given array 
public class MaxElement {
    static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking array as input from user of user's size;
        System.out.print("Enter the size of your array: ");
        int size = sc.nextInt();
        int arr[];
        arr = new int[size]; // declaring the array of user's 'size';

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxOfArray(arr);
        // int arr = new int[size];

        System.out.println("The Max elements of array is : " + ans);
        sc.close();
    }
}
