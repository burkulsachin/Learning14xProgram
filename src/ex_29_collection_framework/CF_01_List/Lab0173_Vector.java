package ex_29_collection_framework.CF_01_List;

import java.util.Vector;

public class Lab0173_Vector {
    public static void main(String[] args) {
        Vector v = new Vector(); // Array
        v.add("Pramod");
        v.add("Amsit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v);
        System.out.println(v.contains("Lucky"));
    }
}
