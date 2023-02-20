package Theory.Recursion.L6_String_Subset_Subsequence;

public class Q1_Removing_all_X {
    public static void main(String[] args) {
        String s = "allxxprsxst";

        // Calling Removing all x function
        String res = removeX(s, new StringBuilder());
        System.out.println(res);
    }

    // Removing all the x form the String:
    // More Optimized Solution:
    private static String removeX(String ques, StringBuilder asf) {
        // Base Case:
        if (ques.length() == 0) {
            return asf.toString();
        }

        // Recursive Call:
        char currentChar = ques.charAt(0);
        if (currentChar == 'x') {
            return removeX(ques.substring(1), asf);
        }
        return removeX((ques.substring(1)), asf.append(currentChar));
    }

}
