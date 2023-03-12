/*
Recursion on Array || Array Problems
 */
package Theory.DataStructure.Recursion;

import java.util.ArrayList;

public class Lecture3 {
    // Q1: Check whether the Array is sorted or not [Ascending Order]
    // Q2: Linear Search with Recursion [From Start]
    // Q3: Linear Search with Recursion [From Last]
    // Q4: Return all the index of the target element.[Returning the ArrayList<>][M-1]
    // Q5: Return all the index of the target element.[Returning the ArrayList<>][M-2]
    // Q6: Binary Search using Recursion
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int len = arr.length;
        RecursionClass3  r3 = new RecursionClass3();
//        System.out.println(r3.isSortedInAscendingOrder(arr, 0));
//        System.out.println(r3.linearSearch(arr, 0, 5));
//        System.out.println(r3.linearSearchFromLast(arr, arr.length-1, 3));
//        System.out.println(r3.allIndexesOfElement(arr,4,0));
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(r3.allIndexesOfElement(arr,4,0, list));
        int idx = r3.binarySearchUsingRecursion(arr, 100, 0, len - 1);
        System.out.println(idx);
    }
}
class RecursionClass3{
    // Q 1:
    boolean isSortedInAscendingOrder(int []arr, int index){
        if(index == arr.length -1)
            return true;
        return arr[index] < arr[index + 1] && isSortedInAscendingOrder(arr, index+1);
    }
    // Q2:
    int linearSearch(int []arr,int index, int key){
        // Base Case:
        if(arr[index] == key)
            return index;
        if(index == arr.length-1)
            return -1;

        return linearSearch(arr, index+1, key);
    }
    // Q3:
    int linearSearchFromLast(int []arr, int index, int key){
        if(index == -1)
            return -1;
        if(arr[index] == key)
            return index;
        return linearSearchFromLast(arr, index -1, key);
    }
    // Q4 [Method-1]
    ArrayList<Integer> res = new ArrayList<>();
    ArrayList<Integer> allIndexesOfElement(int []arr, int target, int index){
        // Base Case:
        if(index == arr.length)
            return res;
        if(arr[index] == target){
            res.add(index);
        }
        // Recursive Call:
        return allIndexesOfElement(arr,target, index +1);
    }
    // Q4 [Method-2]
    ArrayList<Integer> allIndexesOfElement(int []arr, int target, int index, ArrayList<Integer> list){
        // Base Case:
        if(index == arr.length)
            return list;
        if(arr[index] == target){
            list.add(index);
        }
        // Recursive Call:
        return allIndexesOfElement(arr,target, index +1, list);
    }

    // Q5: Binary Search:
    int binarySearchUsingRecursion(int []arr,int target, int st, int end){
        int mid = st + (end - st)/2;
        // Base Case:
        if(st > end)
            return -1;
        if (arr[mid] == target) {
            return mid;
        }

        // Recursive Call:
        else if(arr[mid] < target){
            return  binarySearchUsingRecursion(arr, target, mid +1, end);
        }

        return binarySearchUsingRecursion(arr,target,st, mid -1);

    }

}
