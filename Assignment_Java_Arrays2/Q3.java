package Assignment_Java_Arrays2;
import java.util.*;
// Q:- find the 'k'th smallest element in the given array
public class Q3 {
    static int kth_SmallestEle(int arr[],int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.printf("Enter %d elements : \n", size);
        //taking our array as input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K : ");
        int k = sc.nextInt();
        
        System.out.printf("The %d smallest element is : %d\n",k,kth_SmallestEle(arr,k));
        sc.close();
    }
}
