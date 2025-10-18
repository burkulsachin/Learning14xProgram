package ex_Arrays;

import java.util.SortedMap;

public class Lab0100_Print_Arrays {
    public static void main(String[] args) {
        //1. Array Declaration and Initialization

        int marks[]={87,78,90,45,34,43,99};
        System.out.println(marks.length);

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);

        System.out.println("----");


//        int i = 0; → Loop starts from index 0.
//        i < marks.length; → Loop continues while i is less than marks.length.
//        (marks.length is 7, because there are 7 elements.)
//        i++ → Increases i by 1 after each iteration.
        System.out.println("--for loop--");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("--For each loop--");

        for (int mark : marks){
            System.out.println(mark);
        }

    }
}
