package Theory.LinkedList.Singly_LL;

public class LL{
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    // Method-1: Inserting to the First Index:
    public void insertFirst(int val){
        // Creating Node:
        Node node = new Node(val);
        node.next = head;
        head = node;

        // Head = Tail for the First Node :
        if (tail == null) {
            tail = head;
        }

        // Increasing the size each time inserting a new node to the LL:
        this.size++;
    }

    // Method-2: Insert to the end:
    public void insertLast(int val){
        // If the LL is empty: then head = tail
        if (tail == null) {
            insertFirst(val);
            return;
        }

        // Creating the Node:
        Node node = new Node(val);
        tail.next = node;
        tail = node;


        // Increasing the size each time inserting a new node to the LL:
        this.size++;
    }

    // Method-3: Insert in the middle:
    public void  insertMiddle(int index, int val){
        // Base Condition: If the tail is null
        if(tail == null || index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        // Creating the Node:
        Node node = new Node(val);

        // Reaching to the previous node of the index provided:
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        // Inserting the Current node in the desired position:
        // 1st Connect the Next node the Current Node:
        // 2nd then connect the temp node the Current Node:
        node.next = temp.next;
        temp.next = node;

        // Increasing the size each time inserting a new node to the LL:
        this.size++;
    }

    // Method-4: Deleting the first Node:
    public int deleteFirst(){
        int val = head.value;

        head = head.next;
        // The un-used node will automatically delete after sometime by Java Garbage Collector.
        // Base Condition: if there is only one node
        if (head == null) {
            tail = null;
        }

        // Decreasing the size each time a new node is deleted from the LL:
        this.size--;

        return val;
    }
    // Method-5: Deleting the last Node:
    public int deleteLast(){
        // Base Condition: If the Size <= 1 or Size < 2
        if(size <= 1){
            return deleteFirst();
        }
        // So, As we couldn't get the Second last Node directly. So we have to traverse the Whole LL.
        int val = tail.value;
        Node secondLast = getNode(size -2);

        //Updating the Tail:
        tail = secondLast;
        tail.next = null;

        // Decreasing the size each time a new node is deleted from the LL:
        this.size--;

        // The un-used node will automatically delete after sometime by Java Garbage Collector.
        return val;
    }

    // Method-6: Delete any node at any particular index:
    public int delete(int index){

        // Base Conditions:
        if(index ==  0){
            return deleteFirst();
        }
        if (index == size){
            return deleteLast();
        }
        // Getting the Previous Node:
        Node previousNodeOfCurrentIndex = getNode(index-1);

        // Value of the target Node:
        int val = (previousNodeOfCurrentIndex.next).value;

        // Getting the Next Node:
        Node nextNodeOfCurrentIndex = previousNodeOfCurrentIndex.next.next;

        // Connect the previousNode with the NextNode:
        previousNodeOfCurrentIndex.next = nextNodeOfCurrentIndex;

        // Decreasing the size each time a new node is deleted from the LL:
        this.size--;

        // The un-used node will automatically delete after sometime by Java Garbage Collector.

        return val;
    }

    // Method-7: Find the Node of a given value
    public Node find(int val){
        Node temp = head;
        while (temp != null){
            if(temp.value == val)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Method-8: Printing all the element of the LL:
    public void printLL(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END"); // Breaking the Line:
    }

    // Method-9: Returning the Node Info in a String:
    public String printNode(Node n){
        StringBuilder sb = new StringBuilder();
        sb.append("Node Value: " + n.value);
        sb.append('\n');
        sb.append("Node Next: "+n.next);
        sb.append('\n');
        sb.append("Node Address: "+n);

        return sb.toString();
    }
    // Method-10: getSize => get the size of the LL:
    public int getSize(){
        return this.size;
    }

    // Method-11: get the Node of given index:
    public Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // Node Class:
    // Private Because data Abstraction.(User Shouldn't have to know what is Node. and how to use node.)
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
