import java.util.Scanner;
import java.util.Stack;

class Pair{
    int val;
    int idx;
    Pair(int val, int idx){
        this.val = val;
        this.idx = idx;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        int[] ans = Solution.stockSpan(a);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution {
    static int[] nextGreaterElementOnLeft(int[] arr){
        int[] ngel = new int[arr.length];
        // Stack will store the index of the greater element on the left:
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i++) {
            int ele = arr[i];
            while (st.size() > 0 && ele > arr[st.peek()]) {
                int idx = st.peek();
                st.pop();
                ngel[idx] = ele;
            }

            // Adding the Current index of the Element to the Stack:
            st.push(i);
        }
        // If there is still elements left on the stack that mens those elements have no greater elements on left:
        while(st.size() > 0){
            int idx = st.peek();
            st.pop();
            ngel[idx] = -1;
        }

        return ngel;
    }
    static int[] stockSpan(int[] a) {
        int[] ngel = nextGreaterElementOnLeft(a);
        // It will store the results:
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = i - ngel[i];
        }

        return res;
    }
}