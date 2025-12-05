package ex_29_collection_framework.CF_01_List.CF_04_MAP_Copy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


//Map Type	Characteristics
//        HashMap--->>>	Fast, no order guaranteed
//LinkedHashMap	--->>>Maintains insertion order
//TreeMap	--->>>Sorted keys (ascending order)

public class Lab0188_Map {
    public static void main(String[] args) {
        System.out.println("===HashMap===");
        Map mp = new HashMap();
        mp.put("name","sachin");
        mp.put("rollNo",1);
        mp.put("Phone",987656778);
        System.out.println(mp);

        System.out.println("===Linked HashMap===");

        Map mp2 = new LinkedHashMap();
        mp2.put("name","sachin");
        mp2.put("rollno",1);
        mp2.put("phone",987654321);
        System.out.println(mp2);

        System.out.println("===Tree Map===");
        Map<Integer, String> map = new TreeMap<>();
        map.put(30, "Thirty");
        map.put(10, "Ten");
        map.put(20, "Twenty");




    }


    

}
