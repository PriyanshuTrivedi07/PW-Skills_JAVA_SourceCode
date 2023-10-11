package Arrays;
// Q:- find the total number of pairs in the array whose sum is equal to the given value x
import java.util.*;

public class TargetSum {
    static int targetPairSum(int arr[],int target){
        int noOfPairs = 0;
        System.out.println("Pairs are :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    noOfPairs++;
                    System.out.printf("(%d %d) \n",arr[i],arr[j]);
                }
            }
        }
        return noOfPairs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = { 4, 6, 3, 5, 8, 2 };
        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the targeted sum : ");
        int targetSum = sc.nextInt();
        
        System.out.println("The total no. of pairs whose sum is "+targetSum+ " are : "+targetPairSum(arr, targetSum));
        sc.close();
    }
}
