package ex_29_collection_framework.CF_01_List;

import java.util.ArrayList;
import java.util.List;

public class Lab0171_List {
    public static void main(String[] args) {
        List fruits = List.of("Orange","Apple","Watermelon","Mango");
        System.out.println(fruits);

        List arraylist = new ArrayList();
        arraylist.add("sachin");
        arraylist.add(1.23);
        arraylist.add("burkul");
        arraylist.add(true);
        arraylist.add(123);

        System.out.println(arraylist);
        System.out.println(arraylist.size());

    }
}
