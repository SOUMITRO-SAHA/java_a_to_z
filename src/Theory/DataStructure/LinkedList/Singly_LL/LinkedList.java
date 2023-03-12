package Theory.DataStructure.LinkedList.Singly_LL;

public class LinkedList {
    Node head; // Head Attribute of the LinkedList Class:

    // Nested Node Class:
    private class Node{
        int data;
        Node next; // Default value of any object is "Null".

        // Constructors
        Node(int data){
            this.data = data;
        }
    }
}
