package Assignment_Java_Arrays2;
import java.util.*;
// Q:- program to test the equality of two arrays
public class Q5 {
    static boolean equalityOfArrays(int arr1[], int arr2[]){
        boolean flag = true;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your Arrays : ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        System.out.printf("Enter %d elements : \n", size);
        //taking our array 'arr1' as input
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        //taking our array 'arr2' as input
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(equalityOfArrays(arr1, arr2));
        sc.close();
    }
}
