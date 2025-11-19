package ex_29_collection_framework.CF_01_List;

import java.util.LinkedList;
import java.util.List;

public class Lab0176_LinkedList {
    static void main(String[] args) {
        List list = new LinkedList();

        list.add("A");
        list.add("B");
        list.add("C");


        list.addFirst("First");
        list.addLast("Last");


        System.out.println(list);

        list.remove("A");
        list.removeFirst();
        list.removeLast();


        System.out.println(list);
    }
}
