package Theory.DataStructure.LinkedList.Doubly_LL;

public class Main {
    public static void main(String[] args) {
        DLL dList = new DLL();

        dList.insertFirst(2);
        dList.insertFirst(3);
        dList.insertFirst(8);
        dList.insertList(5);
        dList.insertMiddle(1,9);

        dList.printLL();
        dList.printReverseLL();
        System.out.println(dList.getSize());

    }
}
