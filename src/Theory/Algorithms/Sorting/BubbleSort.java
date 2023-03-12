package Theory.Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Iterative Method
        int []arr = {2,-8, 99, 4, 77, 69};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        // Recursive Method:
        int []arr2 = {2,-8, 99, 4, 77, 69};
        bubbleSortUsingRecursion(arr2, arr2.length-1);
        System.out.println(Arrays.toString(arr2));
    }
    static void bubbleSort(int []arr){
        int len = arr.length;
        // Iterating:
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1 - i; j++) {
                // Checking:
                if(arr[j] > arr[j+1]){
                    // Swap:
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void bubbleSortUsingRecursion(int []arr, int lastIndex){
        boolean isSorted = true;

        // Base Case:
        if(lastIndex == 0)
            return;

        // Iterating through and put in appropriate position:
        for (int i = 0; i < lastIndex; i++) {
            // Checking:
            if(arr[i] > arr[i+1]){
                isSorted = false;
                // Swap:
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        // Recursive Call:
        if(!isSorted)
            bubbleSortUsingRecursion(arr, lastIndex - 1);
    }
}
