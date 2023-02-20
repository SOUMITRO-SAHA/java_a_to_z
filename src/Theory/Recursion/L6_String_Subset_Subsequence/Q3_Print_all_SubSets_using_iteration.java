package Theory.Recursion.L6_String_Subset_Subsequence;

import java.util.ArrayList;
import java.util.List;

public class Q3_Print_all_SubSets_using_iteration {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subSets(arr));
    }

    // All the Sub-Sets using Iteration:
    static List<List<Integer>> subSets(int[] arr) {
        // Creating List of List:
        List<List<Integer>> outer = new ArrayList<>();

        // the first element will be empty arrayList;
        outer.add(new ArrayList<>());

        // For the other Lists inside the Outer List
        for (int num: arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                // Creating internal List
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        // Returning the List
        return outer;
    }
}
