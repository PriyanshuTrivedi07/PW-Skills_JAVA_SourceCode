package Assignment_Java_Arrays;
// Q:- calculate the minimum element in the array using standard library method
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        int arr[] = { 2, -3, 5, 8, 1, 0, -4 };
        // int min = arr[0];
        // int i = 0;
        // while (i < arr.length) {
        //     if (arr[i] < min) {
        //         min = arr[i];
        //     }
        //     i++;
        // }
        Arrays.sort(arr);
        System.out.println(arr[0]); //using inbuilt functions
    }
}
