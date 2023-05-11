package Assignment_Java_Arrays;

public class Q3 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int element : arr) {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }
    }
}
