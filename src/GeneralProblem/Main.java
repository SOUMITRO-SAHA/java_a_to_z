package GeneralProblem;
import java.util.*;
/******************************************************************************

 Alice's Encoding :

 *******************************************************************************/

public class Main
{
    public static void main(String[] args) {
        // String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // String s = "aHeTiz";
         String s = "zaBc";
//         String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(solve(s));
    }
    public static String solve(String s){
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; i++){
            char currentChar = s.charAt(i);
            char ch = (char)(currentChar - i%26);
            if(ch >= 'Z' && ch < 'a') {
                ch += 26;
            }
            else if(ch < 'A')
            {
                ch += 26;
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}


