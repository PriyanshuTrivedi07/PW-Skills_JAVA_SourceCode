package Sorting;

public class QuickSort {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st]; // let first element as our pivot
        int cnt = 0;
        for (int i = st + 1; i <= end; i++) { // to count the no. of smaller elements then pivot
            if (arr[i] <= pivot)
                cnt++;
        }
        int pivotIdx = st + cnt; // the right index of the pivot element
        swap(arr, st, pivotIdx);

        int i = st, j = end;
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void quickSort(int[] arr, int st, int end) {
        if (st >= end)
            return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("Before Sorting : ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting : ");
        printArray(arr);
    }
}
