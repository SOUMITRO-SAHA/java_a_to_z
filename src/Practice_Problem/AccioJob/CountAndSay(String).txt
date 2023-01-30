import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());

        Solution ob = new Solution();

        System.out.println(ob.countAndSay(n));
    }
}
class Solution
{
    public String countAndSay(int n) {
        // Steps: 1. Count the current number
        // Steps: 2. Update the Next Number
        // Steps: 3. Repeat the task for n times

        String ans = "1";
        for (int i = 2; i <= n; i++) { // Time-Complexity: O(n)
            ans = countAndUpdate(ans);
        }

        return ans;
    }

    String countAndUpdate(String s){
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int position = 0;
        // Iterating the Array:
        int i = 0;
        // Two Pointer Approach: Total Time-Complexity: O(n)
        while (i < len){
            int count = 0;
            char currentNumber = s.charAt(i);
            while (position < len && s.charAt(position) == currentNumber){
                count++;
                position++;
            }

            i = position;


            // Updating the SB:
            sb.append(count);
            sb.append(currentNumber);
        }

        return sb.toString();
    }
}
