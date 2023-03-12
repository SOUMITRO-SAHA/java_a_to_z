package Theory.DataStructure.LinkedList.Circular_LL;

public class CLL {
    Node head;
    Node tail;

    public CLL(int data) {
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    // Methods:
    void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void insertAfterTail(int data) {
        if (tail == null) {
            insertLast(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        newNode.next = head;
    }

    void deleteNode(int index) {
        Node temp = head;
        Node prev = null;
        // Edge Case:
        if (index == 0) {
            head = head.next;
            tail.next = head;
            return;
        }
        int i = 1;
        do {
            prev = temp;
            temp = temp.next;
            if (i == index) {
                prev.next = temp.next;
                break;
            }
            i++;
        } while (temp != head);
    }

    void displayLL(){
        Node temp = head;
        if (head == null) {
            return;
        }
        do{
            System.out.print(temp.data+"->");
            temp = temp.next;
        }while (temp != head);
        System.out.println();
        /*
        while (temp.next != head) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data);
        */
    }
    private static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
