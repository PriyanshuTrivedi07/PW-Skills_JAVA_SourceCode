package Arrays;

// Q:- Return an array of 2 elements with first element as Smallest element of given array and second element is largest element of given array using inbuilt method .sort();
import java.util.*;

public class ReturnArray {
    static int[] smallestAndLargestElement(int arr[]) {
        Arrays.sort(arr);
        // int ans[] = new int[2];
        // ans[0] = arr[0];
        // ans[1] = arr[arr.length-1];
        int ans[] = { arr[0], arr[arr.length - 1] };
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 99, 5, 8, 0, 1, 78, 9 }; //we can also take array as input from the user
        int ans[] = smallestAndLargestElement(arr);
        System.out.println("Smallest : " + ans[0]);
        System.out.println("Largest : " + ans[1]);
    }
}
