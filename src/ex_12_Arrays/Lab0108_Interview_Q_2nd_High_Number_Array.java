package ex_12_Arrays;

import java.util.Arrays;

public class Lab0108_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int num[]= {3,8,45,342,445,33,223,2233,445,443,322};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);
    }
}
