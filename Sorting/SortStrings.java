package Sorting;

public class SortStrings {
    static void sortStringArray(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // find the index of lexographically smallest string
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // swap the smallest string to the current 'ith' string
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        String[] names = { "mohit", "priyanshu", "kushagra", "jai", "sudhanshu", "shivam", "naveen", "raman" };
        sortStringArray(names);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " ");
        }
    }
}
