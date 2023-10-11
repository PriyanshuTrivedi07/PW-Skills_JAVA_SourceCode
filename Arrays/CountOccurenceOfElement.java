package Arrays;

public class CountOccurenceOfElement {
    static int countOccurence(int arr[],int n){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,2,54,2,5,4}; //can also take input from user
        int n = 4;
        int ans = countOccurence(arr, n);
        System.out.println("Count of X : "+ans);
    }
}
