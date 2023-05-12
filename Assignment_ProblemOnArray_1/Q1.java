package Assignment_ProblemOnArray_1;
// Q1 - Given an array sorted in increasing order of size n and an integer x, find if there exists a
// pair in the array whose absolute difference is exactly x.(n>1)
import java.util.*;

// import Conditionals.absoluteValue;
public class Q1 {
    static boolean pairAbsoluteDifference(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int absltDiff = arr[i] - arr[j];
                if (absltDiff < 0) {
                    absltDiff *= -1;
                }
                if (absltDiff == x) {
                    return true;
                }

            }
        }
        return false;
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
        System.out.println("Enter the x : ");
        int x = sc.nextInt();
        if (pairAbsoluteDifference(arr, x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
