package Assignment_Java_Arrays2;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.printf("Enter %d elements : \n",size);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        int ansArr[] = new int[size];

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                ansArr[idx] = arr[i];
                idx++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ansArr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println("The array after placing all negative elements at the end of array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ansArr[i] + " ");
        }
        sc.close();
    }
}
