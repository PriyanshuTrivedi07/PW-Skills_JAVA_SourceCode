package Assignment_Java_Arrays;
// convert the list of given string into an array of strings and print all strings stored on odd indices of the array.

public class Q2 {
    public static void main(String[] args) {
        String arr[] = {"ab","bc","cd","de","ef","fg","gh"};
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
