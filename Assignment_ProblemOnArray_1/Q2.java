package Assignment_ProblemOnArray_1;
import java.util.*;
// Q2 - Given an array of size n, find the total number of occurrences of given number x.
public class Q2 {
    static int NumberOfOccurences(int arr[] , int x){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
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
        System.out.print("Enter the Number(x) you want to search : ");
        int x = sc.nextInt();

        int ans = NumberOfOccurences(arr, x);
        System.out.printf("The Total Number of occurrences of '%d' is '%d'\n",x,ans);


        sc.close();
    }
}
