package Theory.Algorithms.Sorting;
import java.util.Arrays;

public class Insertion_Sort {
    static void insertionSort(int []arr){
        /*
         * Overall Time-Complexity of Insertion Sort is O(n^2).
         * And, Space Complexity is O(1).
         */
        // The complexity of this loop is O(n), where n is the length of the array.
        // This is because the loop iterates through all the elements of the array once.
        for(int i = 1; i < arr.length; i++){
            // We store the current element in a separate variable for convenience.
            int currentElement = arr[i];
            int j = i-1;

            // The complexity of this loop is O(k), where k is the number of elements that are shifted.
            // In the worst case, when the array is sorted in descending order, all the elements will have to be shifted.
            // Therefore, the complexity of this loop is O(n).
            while(j >= 0 && arr[j] > currentElement){
                // Shifting the Elements:
                arr[j+1] = arr[j];
                j--;
            }

            // Inserting the element at the correct index:
            arr[j+1] = currentElement;
        }
    }



    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};

        //Printing the Array Before Sorting:
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        // sort this array:
        insertionSort(arr);

        System.out.println("\nAfter Sorting:");
        //Printing the Array After Sorting:
        System.out.println(Arrays.toString(arr));
    }
}
