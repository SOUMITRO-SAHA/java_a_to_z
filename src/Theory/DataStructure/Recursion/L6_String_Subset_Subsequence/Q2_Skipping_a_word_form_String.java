package Theory.DataStructure.Recursion.L6_String_Subset_Subsequence;

public class Q2_Skipping_a_word_form_String {
    public static void main(String[] args) {
        String str = "abcstddefstdghistdjklstdmno";

        // Remove all the "std" 's form the String:
        String res = removeSTD(str, new StringBuilder());
        System.out.println(res);

        String str2 = "hellocandyismycanfavouritecancandy";
        // Remove all 'can' which is not candy:
        System.out.println(removeCanButNotCandy(str2, new StringBuilder()));
    }

    private static String removeCanButNotCandy(String ques, StringBuilder asf) {
        // Base Case:
        if (ques.length() == 0) {
            return asf.toString();
        }

        // Recursive CaLL
        char currentChar = ques.charAt(0);

        if(ques.startsWith("can") && !ques.startsWith("candy")){
            return removeCanButNotCandy(ques.substring(3), asf);
        }
        return removeCanButNotCandy(ques.substring(1), asf.append(currentChar));
    }

    // Skipping the target string:
    private static String removeSTD(String ques, StringBuilder asf) {
        // Base Case:
        if (ques.length() == 0) {
            return asf.toString();
        }

        // Recursive CaLL
        char currentChar = ques.charAt(0);

        if(ques.startsWith("std")){
            return removeSTD(ques.substring(3), asf);
        }
        return removeSTD(ques.substring(1), asf.append(currentChar));
    }

    //
}
