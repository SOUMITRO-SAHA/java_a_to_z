/*
Merge Sort Using Recursion (Theory + Complexity + Code)
https://www.youtube.com/watch?v=iKGAgWdgoRk&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod&index=5&ab_channel=KunalKushwaha
 */
package Theory.Recursion;

import java.util.Arrays;

public class Lecture5 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort1(arr);

        System.out.println(Arrays.toString(arr));
    }

    // Not In-place Sorting: And not very Optimised:
    // Time-Complexity: O(N * log N);
    // Space-Complexity:
    static int []mergeSort1(int []arr){
        // Base Case:
        if(arr.length == 1)return arr;

        int mid = arr.length /2;
        // Recursive Call:
        int[] left = mergeSort1(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort1(Arrays.copyOfRange(arr, mid, arr.length));

        // Return the Arranged array:
        return organisedArray(left, right);
    }

    private static int[] organisedArray(int[] first, int[] second) {
        int len1 = first.length;
        int len2 = second.length;

        int i = 0, j = 0, k = 0;
        int[] mix = new int[len1 + len2];

        // Condition:
        while (i < len1 && j < len2) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // It could be possible any one of the array is not completed:
        while (i < len1) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < len2) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

}
