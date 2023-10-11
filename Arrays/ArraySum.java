package Arrays;
// Q:- Calculate the sum of all elements in the array
import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        int size = sc.nextInt();
        int arr[];
        arr = new int[size]; //defclaring the array of user's 'size';
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // int arr = new int[size];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("the sum of the elements of array is : "+sum);
        sc.close();
    }
}
