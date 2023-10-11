package Arrays;

import java.util.*;
// Q:- given an array of integers .Return the first value that is repeating in this array . if no value is being repeated , return -1;

public class FirstRepeatingNum {
    static int repeatingNum(int arr[]) {
        for (int i = 0; i < arr.length; i++) { //picking first num
            for (int j = i+1; j < arr.length; j++) { // picking second num
                if (arr[i] == arr[j]) { //found ans
                    return arr[i];
                }
            }
        }
        return -1;
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
        System.out.println("First Repeating element is : "+repeatingNum(arr));
        sc.close();
    }
}
