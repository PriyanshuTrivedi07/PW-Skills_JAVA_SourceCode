package Arrays;

public class SortedOrNot {
    static boolean isSorted(int arr[]) {
        boolean check = true; // let our array is Sorted
        for (int i = 1; i < arr.length - 1; i++) {
            // compare current element from previous element
            if (arr[i] <= arr[i - 1]) {
                check = false; // not sorted
                break;
            }

        }
        return check;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 4,7,9};
        System.out.println("Is Sorted : " + isSorted(arr));
        // boolean ans = isSorted(arr);
        // if(ans == true){
        //     System.out.println("Array is sorted");
        // }else{
        //     System.out.println("not sorted");
        // }
    }
}
