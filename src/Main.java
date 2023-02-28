/*
Implementing Quick Sort
https://course.acciojob.com/idle?question=52936fff-9a86-45e6-a952-ce5918f9035f
*/
import java.util.*;

class Solution{
    static void quickSort(int[] arr) {
        int n = arr.length;
        qS(arr, 0, n - 1);
    }

     /*
     TC:
     Best Case: When the partition happen in the middle so the division will be n/2. Same as Merge Sort.
     So, TC : O(n * log n)
     Worst Case: O(n^2) [When the partition happens at the end.]

     SC:
     Best Case: O(log n)
     Worst Case: O(n)
     =========================================================
     But, It can be improve by randomly select the pivot element.
     */
    private static void qS(int[] arr, int l, int r) {
        if (l < r) {
            int partitionIndex = partition(arr, l, r);
            qS(arr, l, partitionIndex - 1); // Left Part
            qS(arr, partitionIndex + 1, r); // Right Part
        }
    }
    // TC: O(n)
    // SC: O(1)
    /*
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
        // Whenever reached the end then swap with the Pivot Element:
        if (arr[i] > pivotedEl) {
            swap(arr, i, r);
        }

        // Current Partition Index is i. So returning i
        return i;
    }
    */
    private static int partition(int[] arr, int l, int r) {
        int i = l;
        int j = l;
        int randomIdx =(int)(Math.random() * (r - l + 1) + l) ;
        // Swapping the rth element in the original Array:
        swap(arr, randomIdx, r);

        int pivotedEl = arr[r];
        while (j < r) {
            if (arr[j] < pivotedEl) {
                // Swap with i th element
                swap(arr,i,j);
                i++;
            }
            j++;
        }
        // Whenever reached the end then swap with the Pivot Element:
        if (arr[i] > pivotedEl) {
            swap(arr, i, r);
        }

        // Current Partition Index is i. So returning i
        return i;
    }


    // TC: O(1)
    // SC: O(1)
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution.quickSort(arr);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}