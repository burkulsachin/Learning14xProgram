package ex_29_collection_framework.CF_01_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ForkJoinPool;

public class Lab0180_LabInterview {
    public static void main(String[] args) {
        ArrayList <Integer>arrayList= new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println(arrayList);

        Collections.sort(arrayList,Collections.reverseOrder());

        for (Integer o:arrayList){
            System.out.println(6*o);
        }
    }
}
