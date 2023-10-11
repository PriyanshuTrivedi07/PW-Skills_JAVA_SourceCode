package Arrays;

import java.util.*;

public class TripletsCount {
    static int targetTripletSum(int arr[], int target) {
        int noOfTriplets = 0;
        System.out.println("Triplets are :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        noOfTriplets++;
                        System.out.printf("(%d %d %d) \n", arr[i], arr[j], arr[k]);
                    }
                }
            }
        }
        return noOfTriplets;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = { 4, 6, 3, 5, 8, 2 };
        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the targeted sum : ");
        int targetSum = sc.nextInt();

        System.out.println("The total no. of pairs whose sum is " + targetSum + " are : " + targetTripletSum(arr, targetSum));
        sc.close();
    }
}
