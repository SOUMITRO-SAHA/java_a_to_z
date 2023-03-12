package Theory.DataStructure.LinkedList.Singly_LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertLast(11);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(13);
        list.insertFirst(23);
        list.insertMiddle(2,69); // TC = O(n);[Worst Case]

//        list.printLL();
//        System.out.println("Size : "+list.getSize());
//
//        System.out.println("Deleted Value : "+list.deleteFirst());
//        list.printLL();
//        System.out.println("Size : "+list.getSize());
//
//        System.out.println("Deleted Value : "+list.deleteLast());
        list.printLL();
        System.out.println("Size : "+list.getSize());

        System.out.println("Deleted Value : "+list.delete(2));
        list.printLL();
        System.out.println("Size : "+list.getSize());

        System.out.println(list.find(233));
    }
}
