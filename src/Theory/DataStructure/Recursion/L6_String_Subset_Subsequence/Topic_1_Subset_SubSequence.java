package Theory.DataStructure.Recursion.L6_String_Subset_Subsequence;

import java.util.ArrayList;
import java.util.Collections;

/*
Sub-set || [for String it is called sub-sequence]
[1,2,3] => [1], [2], [3], [1,2], [1,3], [2,3]

- Order Should be same but need not to, be in continuous fashion.
- Not adjacent allocation is allowed, but order should be maintained.
 */
public class Topic_1_Subset_SubSequence {
    public static void main(String[] args) {
        String str = "abc";
        // Print all the subsequences of the given string:
        printSubsequences(str, "");

        // Print all the subsequences in lexicographically order:
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> res = printSubsequencesInLex(str,"", arr);
        Collections.sort(res);
        System.out.println(res);
    }

    private static ArrayList<String> printSubsequencesInLex(String up, String p, ArrayList<String> arr) {
        // Base Case:
        if (up.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Left Call: Taking the Char:
        char ch = up.charAt(0);
        ArrayList<String> left = printSubsequencesInLex(up.substring(1), p+ch, arr);

        // Right Call: Ignoring the char:
        ArrayList<String> right = printSubsequencesInLex(up.substring(1), p, arr);

        left.addAll(right);

        return left;
    }

    // Recursion Method:
    // Method-1: Directly Printing the Result:
    private static void printSubsequences(String up, String p) {
        // Base Case:
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        // Left Call: Taking the Char:
        char ch = up.charAt(0);
        printSubsequences(up.substring(1), p+ch);

        // Right Call: Ignoring the char:
        printSubsequences(up.substring(1), p);
    }

    // Method-2: Returning an ArrayList:

    // Iteration Method:
    // Q3_Print_all_SubSets_using_iteration
}
