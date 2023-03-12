package Theory.DataStructure.LinkedList.Doubly_LL;
/*
Linked List - Singly + Doubly + Circular (Theory + Code + Implementation)
https://youtu.be/58YbpRDc4yw?t=4558
 */

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }
    // Method-1: Insert First:
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
//        node.prev = null; // Automatically it will be null only.

        // Base Case: if the LL is empty
        if (head != null) {
            head.prev = node;
        }
        if (tail == null) {
            tail = head;
        }
        // Assigning the Head to node.
        head = node;


        // Increasing the size:
        this.size++;
    }

    // Method-2: Insert Last:
    public void insertList(int val) {
        // If the LL is empty:
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        node.prev = tail;
        tail = node;

        // Increasing the size:
        this.size++;
    }

    // Method-3: Insert Middle
    public void insertMiddle(int index, int value){
        Node temp = head;

        // Reaching the previous node of target Index:
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        // Getting the Node at targeted Index:
        Node targetNode = temp.next;

        //Inserting the node in the target Index:
        Node node = new Node(value);

        // Updating the Node:
        node.next = targetNode;
        node.prev = temp;

        // Updating the Targeted Node:
        targetNode.prev = node;
        temp.next = node;

        // Increasing the size:
        this.size++;
    }


    // Printing the LL:
    public void printLL(){
        // Checking that the next is not null
        Node temp = this.head;
        System.out.print("START <- ");
        while (temp != null) {
            System.out.print(temp.value);

            // Condition for Head:
            if (temp.next != null) {
                System.out.print(" <=> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> END");
    }
    // Printing the Reverse LL:
    public void printReverseLL(){
        // Checking that the next is not null
        Node temp = this.tail;

        System.out.print("END <- ");
        while (temp != null) {
            System.out.print(temp.value);

            // Condition for Head:
            if (temp.prev != null) {
                System.out.print(" <=> ");
            }
            temp = temp.prev;
        }
        System.out.println(" -> START");
    }

    // Get the Size
    public int getSize(){
        return this.size;
    }

//    // Reverse the LL:
//    public void reverse(){
//        Node temp = head;
//        head = tail;
//        tail = temp;
//    }




    // Node Class for DLL:
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }


    }
}
