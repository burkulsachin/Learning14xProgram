package ex_29_collection_framework.CF_01_List.CF_04_MAP_Copy;

import java.util.HashMap;

public class Lab0189_Map2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",100);
        map.put("id4",null);
        map.put(null,102);
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get("id2"));



    }
}
