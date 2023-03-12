///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
//
//class LL{
//    private ListNode head;
//    private ListNode tail;
//    private int size;
//    public LL(){
//        this.size = 0;
//    }
//    public LL(int []arr){
//        for (int i = 0; i < arr.length; i++) {
//            insertLast(arr[i]);
//            this.size++;
//        }
//    }
//    // Method-1: Inserting to the First Index:
//    public void insertFirst(int val){
//        // Creating Node:
//        ListNode node = new ListNode(val);
//        node.next = head;
//        head = node;
//
//        // Head = Tail for the First Node :
//        if (tail == null) {
//            tail = head;
//        }
//
//        // Increasing the size each time inserting a new node to the LL:
//        this.size++;
//    }
//
//    // Method-2: Insert to the end:
//    public void insertLast(int val){
//        // If the LL is empty: then head = tail
//        if (tail == null) {
//            insertFirst(val);
//            return;
//        }
//
//        // Creating the Node:
//        ListNode node = new ListNode(val);
//        tail.next = node;
//        tail = node;
//
//
//        // Increasing the size each time inserting a new node to the LL:
//        this.size++;
//    }
//
//    // Method-3: Insert in the middle:
//    public void  insertMiddle(int index, int val){
//        // Base Condition: If the tail is null
//        if(tail == null || index == 0){
//            insertFirst(val);
//            return;
//        }
//        if(index == size){
//            insertLast(val);
//            return;
//        }
//
//        // Creating the Node:
//        ListNode node = new ListNode(val);
//
//        // Reaching to the previous node of the index provided:
//        ListNode temp = head;
//        for (int i = 1; i < index; i++) {
//            temp = temp.next;
//        }
//
//        // Inserting the Current node in the desired position:
//        // Garry and the linked list problem Connect the Next node the Current Node:
//        // 2nd then connect the temp node the Current Node:
//        node.next = temp.next;
//        temp.next = node;
//
//        // Increasing the size each time inserting a new node to the LL:
//        this.size++;
//    }
//
//    // Method-4: Deleting the first Node:
//    public int deleteFirst(){
//        int val = head.val;
//
//        head = head.next;
//        // The un-used node will automatically delete after sometime by Java Garbage Collector.
//        // Base Condition: if there is only one node
//        if (head == null) {
//            tail = null;
//        }
//
//        // Decreasing the size each time a new node is deleted from the LL:
//        this.size--;
//
//        return val;
//    }
//    // Method-5: Deleting the last Node:
//    public int deleteLast(){
//        // Base Condition: If the Size <= 1 or Size < 2
//        if(size <= 1){
//            return deleteFirst();
//        }
//        // So, As we couldn't get the Second last Node directly. So we have to traverse the Whole LL.
//        int val = tail.val;
//        ListNode secondLast = getNode(size -2);
//
//        //Updating the Tail:
//        tail = secondLast;
//        tail.next = null;
//
//        // Decreasing the size each time a new node is deleted from the LL:
//        this.size--;
//
//        // The un-used node will automatically delete after sometime by Java Garbage Collector.
//        return val;
//    }
//
//    // Method-6: Delete any node at any particular index:
//    public int delete(int index){
//
//        // Base Conditions:
//        if(index ==  0){
//            return deleteFirst();
//        }
//        if (index == size){
//            return deleteLast();
//        }
//        // Getting the Previous Node:
//        ListNode previousNodeOfCurrentIndex = getNode(index-1);
//
//        // Value of the target Node:
//        int val = (previousNodeOfCurrentIndex.next).val;
//
//        // Getting the Next Node:
//        ListNode nextNodeOfCurrentIndex = previousNodeOfCurrentIndex.next.next;
//
//        // Connect the previousNode with the NextNode:
//        previousNodeOfCurrentIndex.next = nextNodeOfCurrentIndex;
//
//        // Decreasing the size each time a new node is deleted from the LL:
//        this.size--;
//
//        // The un-used node will automatically delete after sometime by Java Garbage Collector.
//
//        return val;
//    }
//
//    // Method-7: Find the Node of a given value
//    public ListNode find(int val){
//        ListNode temp = head;
//        while (temp != null){
//            if(temp.val == val)
//                return temp;
//            temp = temp.next;
//        }
//        return null;
//    }
//
//    // Method-8: Printing all the element of the LL:
//    public void printLL(){
//        ListNode temp = head;
//        while (temp != null){
//            System.out.print(temp.val + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("END"); // Breaking the Line:
//    }
//
//    // Method-9: Returning the Node Info in a String:
//    public String printNode(ListNode n){
//        StringBuilder sb = new StringBuilder();
//        sb.append("Node Value: " + n.val);
//        sb.append('\n');
//        sb.append("Node Next: "+n.next);
//        sb.append('\n');
//        sb.append("Node Address: "+n);
//
//        return sb.toString();
//    }
//    // Method-10: getSize => get the size of the LL:
//    public int getSize(){
//        return this.size;
//    }
//
//    // Method-11: get the Node of given index:
//    public ListNode getNode(int index){
//        ListNode temp = head;
//        for (int i = 0; i < index; i++) {
//            temp = temp.next;
//        }
//
//        return temp;
//    }
//
//    // Method-12: get head
//    public ListNode getHead(){
//        return head;
//    }
//}
//
//public class Solution {
//    public static void main(String[] args) {
//        LL ll1 = new LL(new int[]{2,4,9});
//        LL ll2 = new LL(new int[]{5,6,4,9});
//
//        ll1.printLL();
//        ll2.printLL();
//
//        Solution sol = new Solution();
//
//        ListNode res = sol.addTwoNumbers(ll1.getHead(), ll2.getHead());
//        while (res != null) {
//            System.out.print(res.val + "->");
//            res = res.next;
//        }
//        System.out.println();
//    }
//
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//    }
//}