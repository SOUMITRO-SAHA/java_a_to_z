package Theory.DataStructure.LinkedList.Circular_LL;

public class Main {
    public static void main(String[] args) {
        CLL cll = new CLL(10);
        cll.insertLast(20);
        cll.insertLast(30);
        cll.insertLast(40);
        cll.insertLast(50);

        cll.displayLL();
        cll.insertAfterTail(69);
        cll.insertAfterTail(6);
        cll.insertAfterTail(100);
        cll.displayLL();
        cll.deleteNode(0);
        cll.displayLL();
        cll.deleteNode(6);
        cll.displayLL();
    }
}
