package ex_29_collection_framework.CF_01_List;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab0186_Tree_Set {
    public static void main(String[] args) {
        Set <Integer>set = new TreeSet();

        set.add(1);
        set.add(3);
        set.add(7);

        System.out.println("Set Elements"+set);

        Iterator iterator=  set.iterator();
        while(iterator.hasNext()){
            System.out.println("Iterator "+iterator.next());
        }

    }
}
