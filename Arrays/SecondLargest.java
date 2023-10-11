package Arrays;

import java.util.*;
// Q:- find the second largest element in the given array 
public class SecondLargest {
    static int largestNum(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secondLargestNum(int arr[]) {
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=largestNum(arr)){
                smax = arr[i];
            }
        }
        return smax;
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
        int ans = secondLargestNum(arr);
        System.out.println("The second largest element is : "+ans);
        sc.close();
    }
}
