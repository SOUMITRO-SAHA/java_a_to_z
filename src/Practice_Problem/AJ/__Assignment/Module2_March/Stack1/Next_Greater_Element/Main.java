package Practice_Problem.AJ.__Assignment.Module2_March.Stack1.Next_Greater_Element;

/*
Main.js
https://course.acciojob.com/idle?question=73772158-09d5-4636-aa41-def2d3158102
 */
import java.lang.*;
import java.io.*;
import java.util.Stack;

class Solution
{
    public static long[] nextLargerElement(long[] arr, int n){
        // Monotonic Stack Algorithm
        // This will store the index of the right large element:
        Stack<Integer> stack = new Stack<>();

        // Storing the Results
        long[] nger = new long[n];

        // Iterating through the array:
        for (int i = 0; i < n; i++) {
            long ele = arr[i];
            // Checking for the next greater element:
            while (stack.size() > 0 && ele > arr[stack.peek()]) {
                int idx = stack.peek();
                stack.pop();
                nger[idx] = ele;
            }

            // adding the current index to the stack
            stack.push(i);
        }

        // Elements left in stack doesn't have their next nger
        while (stack.size() > 0) {
            int idx = stack.pop();
            nger[idx] = -1;
        }


        return nger;
    }
}
class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] inputLine = br.readLine().trim().split(" ");
        long[] arr = new long[n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        long[] res = Solution.nextLargerElement(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(res[i] + " ");
        System.out.println();
    }
}
