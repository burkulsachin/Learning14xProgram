package ex_29_collection_framework.CF_01_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab0175_ArrayList {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(45);
        marks.add(98);
        marks.add(89);
        marks.add(90);

        System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);;
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
