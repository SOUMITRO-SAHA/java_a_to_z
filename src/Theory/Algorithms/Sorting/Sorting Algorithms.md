## Marge two sorted Arrays to an 3rd Array:

```java
package Theory.Algorithms.Sorting;

import java.util.Arrays;

public class MargeSort {
    public static void main(String[] args) {
        int[] arr1 = {2, 10, 15, 20, 23};
        int[] arr2 = {5, 7, 12};
        // Calling Merge Sort:
        int[] result = mergeSort(arr1, arr2);

        // Printing the Result:
        System.out.println(Arrays.toString(result));
    }

    // Merging two sorted array into a 3rd Array:
    // TC: O(n+m)
    // SC: O(n+m)
    private static int[] mergeSort(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n + m];

        // First, Iterate over the two array and compare and marge
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }
        // Second, Check is any one of the array is still remaining:
        while (i < arr1.length) {
            ans[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            ans[k++] = arr2[j++];
        }

        // Returning the Resultant Array:
        return ans;
    }
}
```

## Sorting an Array inner Part:

```java
package Theory.Algorithms.Sorting;

import java.util.Arrays;

public class MargeSort {
    public static void main(String[] args) {
        // Merge in Between:
        int[] arr = {1, 4, 7, 8, 19, 2, 3, 5};
        int mid = 4;
        int l = 0;
        int r = arr.length - 1;
        merge(arr, l, r, mid);

        // Printing the Array:
        System.out.println(Arrays.toString(arr));
    }

    // Sorting the inner of an Array using Merge Sort Technique:
    // TC: O(n)
    // SC: 0(n)
    private static void merge(int[] arr, int l, int r, int mid) {
        int len = r - l + 1;
        int[] ans = new int[len];
        int i = 0;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            ans[k++] = arr[i++];
        }
        while (j <= r) {
            ans[k++] = arr[j++];
        }

        // Copy Back the Answer to the original Array:
        for (int n = l, m = 0; n <= r; n++) {
            arr[n] = ans[m++];
        }
    }
}
```

## Merge Sort Algorithm:

```java
package Theory.Algorithms.Sorting;

import java.util.Arrays;

public class MargeSort {
    public static void main(String[] args) {
        // Merge in Between:
        int[] arr = {1, 4, 7, 8, 19, 2, 3, 5};
        int l = 0;
        int r = arr.length - 1;
        // Calling the Mergesort using Recursion:
        mergeSort(arr, l, r);

        // Printing the Result:
        System.out.println(Arrays.toString(arr));
    }

    // Merging an array using Recursion:
    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            // Merging the left and right part:
            merge(arr, l, mid, r);
        }

    }

    // Sorting the inner of an Array using Merge Sort Technique:
    // TC: O(n)
    // SC: 0(n)
    private static void merge(int[] arr, int l, int mid, int r) {
        int len = r - l + 1;
        int[] ans = new int[len];
        int i = l;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            ans[k++] = arr[i++];
        }
        while (j <= r) {
            ans[k++] = arr[j++];
        }

        // Copy Back the Answer to the original Array:
        for (int n = l, m = 0; n <= r; n++) {
            arr[n] = ans[m++];
        }
    }
}

```