package Arrays;
import java.util.*;
/* Q:- Given an array of integers of size n . Answer 'q' queries where you need to print the sum of values in a 
given range of indices from l to r (both included) .
Note : the values of l and r in queries follow 1-based indexing */
public class ArraySumFromLtoR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        System.out.println("Enter " + size + " elements : ");
        // Array input (1-based indexing)
        for (int i = 1; i <= size; i++) {
            arr[i] = sc.nextInt();
        }  

        int[] pref = PrefixSum.prefixSumArray(arr);

        System.out.print("Enter number of Queries : ");
        int q = sc.nextInt();
        while(q-- > 0){ //use 'q' and then decrement it
            System.out.print("Enter Range (l to r) : ");
            int l = sc.nextInt();
            // System.out.print(" to ");
            int r = sc.nextInt();
            int sum = pref[r] - pref[l-1];
            System.out.println("The Sum is : "+ sum);
        }
        sc.close();
    }
}
