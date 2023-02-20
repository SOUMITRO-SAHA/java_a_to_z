/*
Recursion - Pattern Questions + Bubble Sort + Selection Sort

Q1:
*****
****
***
**
*

 */
package Theory.Recursion;

import java.util.Arrays;

public class Lecture4 {
    public static void main(String[] args) {
        int n = 4;
        int []arr = {5,4,3,2,1};

        RecursionClass4 r4 = new RecursionClass4();
        // Q1:
//        r4.pattern1(n);
        // Q2: Bubble Sort using Recursion.
        r4.bubbleSortUsingRecursion(arr, arr.length -1);
        System.out.println(Arrays.toString(arr));

    }
}
class RecursionClass4{
    void pattern1(int n){
        // Base Case:
        if(n <= 0)
            return;

        // Printing the Pattern for the Current Line:
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Recursive Call:
        pattern1(n-1);
    }
    void bubbleSortUsingRecursion(int []arr, int lastIndex){
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