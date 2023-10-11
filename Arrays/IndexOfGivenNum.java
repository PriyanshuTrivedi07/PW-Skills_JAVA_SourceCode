package Arrays;

// Q:- Search the first occurence of given element x in the array. if present then return the index else return -1
import java.util.*;

public class IndexOfGivenNum {
    static void searchInArray(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Not found !");
        } else {
            System.out.printf("Found %d at index %d", num, index);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = { 2, 3, 4, 0, 8, 7, 5 };
        // taking array as input from user of user's size;
        System.out.print("Enter the size of your array: ");
        int size = sc.nextInt();
        int arr[];
        arr = new int[size]; // declaring the array of user's 'size';

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to search: ");
        int num = sc.nextInt();
        searchInArray(arr, num);
        // System.out.printf("%d is at index %d in the array",num,index);
        sc.close();
    }
}
