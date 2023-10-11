package Arrays;
// Q:- find the unique number in a given array where all the elements are being repeated twice

import java.util.*;

public class FindUniqueNum {
    static void uniqueNum(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean flag = false; //let the element is not present
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                else if(arr[j] == arr[i]){
                    flag = true; // means element is present
                    break;
                }
            }
            if(flag == false){
                System.out.println("Unique Element is : " +arr[i]+" at index "+i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = { 4, 6, 3, 5, 8, 2 };
        System.out.print("Enter the size of your array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements : ");
        //Array input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        uniqueNum(arr);
        sc.close();
    }
}
