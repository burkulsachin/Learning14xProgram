package ex_29_collection_framework.CF_01_List;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab0185_SET_HS_LHS_TS {
    public static void main(String[] args) {

        System.out.println("==============HashSet==================");



        Set set = new HashSet();
        // Hashing mechanism to store the element,no order.
        // no duplicates

        set.add("apple");
        set.add("Orange");
        set.add("Watermelon");
        set.add("Watermelon");
        set.add(null);
        System.out.println(set);


        System.out.println("============LinkedHAshset====================");


        Set set1 = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        set1.add("apple");
        set1.add("Orange");
        set1.add("Watermelon");
        set1.add("Watermelon");
        set1.add( null);
        set1.isEmpty();
        set1.contains("Orange");
        set1.size();

        System.out.println(set1);

        System.out.println("==============Tree Set==================");

        Set treeSet =new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // Natural Sorting order is maintained.

        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("WaterMelon");
        treeSet.add("WaterMelon");
//        ts.add(123); // java.lang.ClassCastException
        //ts.add(null); // java.lang.NullPointerException
        System.out.println(treeSet);


    }
}
