package ex_29_collection_framework.CF_01_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

public class Lab0177_AL_Itaration {
    static void main(String[] args) {
        List<String> list =new ArrayList<String>();

        list.add("Sachin");
        list.add("Archana");
        list.add("burkul");

        System.out.println("- To Print Arraylist 1-");

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("- To Print Arraylist 2-");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("- To Print Arraylist 3 -");
        for( int i=0; i<list.size();i++)
        {
            System.out.println(list.get(i));
        }



    }
}
