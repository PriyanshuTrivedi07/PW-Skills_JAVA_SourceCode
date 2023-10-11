package Arrays;
import java.util.Arrays;
public class ArrayRefrence {
    // fuction to print the given array
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changeArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 3;
        arr[1] = 6;
        arr[2] = 1;
        arr[3] = 9;
        // int arr2[] = arr;
        // System.out.println("original Array : ");
        // printArray(arr);
        // System.out.println("copied array 2 : ");
        // printArray(arr2);

        /* 
        //SHALLOW COPY :
        arr[0] = 0;
        arr[3] = -1;
        System.out.println("original Array After changing values : ");
        printArray(arr);
        System.out.println("copied array2 after changing the value of arr : ");
        printArray(arr2); //hence change in first array reflects the changes in the second array also */

        /* 
        //PASSING ARRAY TO A FUNCTION : 
        System.out.println("our Array before calling change function : ");
        printArray(arr);
        changeArray(arr); // array is always passed by refrence to the fucntion not by value
        System.out.println("our Array after calling change function : ");
        printArray(arr); 
        */

        /*
        //DEEP COPY using .clone() : 
        int arr2[] = arr.clone(); //copying array 'arr' to 'arr2' using .clone()
        System.out.println("original Array : ");
        printArray(arr);
        System.out.println("copied array 2 : ");
        printArray(arr2);

        arr[0] = 0; //changing the values of 'arr' to see whether it reflects in 'arr2' or not
        arr[3] = -1;
        System.out.println("original Array After changing values : ");
        printArray(arr);
        System.out.println("copied array2 after changing the value of arr : ");
        printArray(arr2); //hence change in first array will not reflects the changes in the second array bcz it is a DEEP COPY
        */

        
        //DEEP COPY using .clone() : 
        int arr2[] = Arrays.copyOfRange(arr, 0, arr.length); //copying array 'arr' to 'arr2' using Arrays.copyOf();
        System.out.println("original Array : ");
        printArray(arr);
        System.out.println("copied array 2 : ");
        printArray(arr2);

        arr[0] = 0; //changing the values of 'arr' to see whether it reflects in 'arr2' or not
        arr[3] = -1;
        System.out.println("original Array After changing values : ");
        printArray(arr);
        System.out.println("copied array2 after changing the value of arr : ");
        printArray(arr2); //hence change in first array will not reflects the changes in the second array bcz it is a DEEP COPY
       
    }
}
