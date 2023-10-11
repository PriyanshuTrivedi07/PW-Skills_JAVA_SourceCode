package Arrays;
import java.util.*;
// Q:- Given Q queries , check if the given number is present in the array or not .
// Note : Value of all the elements in the array is less than 10 to the power 5;
public class FrequencyArray {
    static int[] makeFrequencyArray(int arr[]){
        int farr[] = new int[100005];
        for(int i=0;i<arr.length;i++){
            farr[arr[i]]++;
        }
        return farr;
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

        int freq[] = makeFrequencyArray(arr); 

        System.out.print("Enter the no. of query : ");
        int q = sc.nextInt(); //no of queries 

        while(q>0){
            System.out.print("Enter the number to be searched : ");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }
        sc.close();
    }
}
