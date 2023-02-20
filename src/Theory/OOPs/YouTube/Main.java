package Theory.OOPs.YouTube;

import Theory.OOPs.YouTube.Custom_DS.CustomArrayList;
import Theory.OOPs.YouTube.Custom_DS.CustomGenericArrayList;

public class Main {
    public static void main(String[] args) {
        // Using Custom ArrayList
//        CustomArrayList list = new CustomArrayList();
////        list.add(4);
////        list.add(5);
////        list.add(6);
////        list.add(9);
//        for (int i = 1; i < 15; i++) {
//            list.add(2 * i);
//        }
//
//        System.out.println(list);
//        System.out.println("Capacity = " + list.capacity());
        CustomGenericArrayList<String> str = new CustomGenericArrayList<>();

        str.add("Hello");
        str.add(" ");
        str.add("World");
        str.add("!");
        System.out.println(str);
        System.out.println("Capacity = " + str.capacity());
    }
}
