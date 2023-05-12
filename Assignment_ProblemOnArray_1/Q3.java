package Assignment_ProblemOnArray_1;
import java.util.*;
// Q3 - Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
// missing number from the first N integers. There are no duplicates in the list.
public class Q3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = { 4, 6, 3, 5, 8, 2 };
        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        int arr[] = new int[size-1];
        System.out.println("Enter " + (size-1) + " elements : ");
        // Array input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<=size;i++){
            boolean flag = false;
            for(int j=0;j<arr.length;j++){
                if(arr[j] == i){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println(i);
            }
            
        }
        sc.close();
    }
}
