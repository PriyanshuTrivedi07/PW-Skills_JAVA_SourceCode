package Arrays;

public class LstOccurenceOfEle {
    static int lastOccurence(int arr[], int n) {
        int lstindex = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == n) {
                lstindex = i;
                break;
            }
        }
        return lstindex;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 2, 54, 2, 5, 4 }; // can also take input from user
        int n = 0;
        int ans = lastOccurence(arr, n);
        if (ans == -1) {
            System.out.println("X is not present in the array");
        } else {
            System.out.println("Last Occurence of X is : " + ans);

        }
    }
}
