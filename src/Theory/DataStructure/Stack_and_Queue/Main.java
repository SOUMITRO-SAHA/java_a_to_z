/*
=======================================================
In-Build Stack Data Structure:
=======================================================
 */
package Theory.DataStructure.Stack_and_Queue;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();

        // Push Operation: Means, inserting elements into the stack:
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50); // This will be on the top;

        // Getting the peak element:
        // st.peek() will return the top most element on the Stack:
        System.out.println(st.peek());

        // Pop Operation: Deleting the top most element form the stack
        // Also return the element
        System.out.println(st.pop());

        // isEmpty() Operation: it will return true or false.
        System.out.println(st.isEmpty()); // false
        System.out.println(st1.isEmpty()); // true
    }
}
