package Theory.DataStructure.Recursion.L7_Permutaion_on_Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Q1_Print_all_Permutation {
    public static void main(String[] args) {
        String s = "abc";
//        permutations("", s);

        ArrayList<String> ans = permutationList("", s);
        Collections.sort(ans);
        System.out.println(ans);
    }
    // Direct Printing:
    private static void permutations(String p, String up) {
        // Base Case:
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        // Recursive Call
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutations(first + ch + second, up.substring(1));
        }
    }

    // Returning ArrayList
    private static ArrayList<String> permutationList(String p, String up) {
        // Base Case:
        if (up.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // Recursive Call
        char ch = up.charAt(0);
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            res.addAll(permutationList(first + ch + second, up.substring(1)));
        }
        return res;
    }

}
