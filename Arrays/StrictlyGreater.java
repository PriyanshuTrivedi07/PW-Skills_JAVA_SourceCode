package Arrays;

public class StrictlyGreater {
    static int strictlyGreater(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 3, 6, 2 }; // can also take input from user
        int n = 2;
        int ans = strictlyGreater(arr, n);
        System.out.println(ans + " number are strictly greater than X");
    }
}
