package Arrays;

//Sort an Array consisting of only 0s and 1s . (Two Pointer Approach)
import java.util.*;

public class SortArray0and1 {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 1st Approach (Brute force Approach)
    /* static void sortZerosAndOnes(int arr[]) {
        int count = 0;
        // loop for counting 0s in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        // loop to add 0s in the array
        for (int i = 0; i < arr.length; i++) {
            if (i < count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    } */
    static void swapValues(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //2nd Approach : (Two pointer Approach)
    static void sortZerosAndOnes(int arr[]){
        int n = arr.length;
        int left = 0,right = n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swapValues(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = { 4, 6, 3, 5, 8, 2 };
        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements consisting 0 and 1s only : ");
        // Array input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array : ");
        printArray(arr);
        sortZerosAndOnes(arr);
        System.out.print("\nSorted Array : ");
        printArray(arr);

        sc.close();
    }
}
