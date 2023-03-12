package Theory.Algorithms.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = {8, 7, 10, 15, 2, 3, 4};
        int[] arr = {2, 3, 4, 7, 8, 10, 15};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr) {
        int n = arr.length;
        qS(arr, 0, n - 1);
    }

    private static void qS(int[] arr, int l, int r) {
        if (l < r) {
            int partitionIndex = partition(arr, l, r);
            qS(arr, l, partitionIndex - 1); // Left Part
            qS(arr, partitionIndex + 1, r); // Right Part
        }
    }

    private static int partition(int[] arr, int l, int r) {
        int i = l;
        int j = l;
        int pivotedEl = arr[r];
        while (j < r) {
            if (arr[j] < pivotedEl) {
                // Swap with i th element
                swap(arr,i,j);
                i++;
            }
            j++;
        }
        // Whenever reached the end then swap with the Pivote Element:
        if (arr[i] > pivotedEl) {
            swap(arr, i, r);
        }

        // Current Partition Index is i. So returning i
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
