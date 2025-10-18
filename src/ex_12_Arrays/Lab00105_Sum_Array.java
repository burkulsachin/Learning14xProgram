package ex_12_Arrays;

public class Lab00105_Sum_Array {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5};

         int sum=0;

         for (int i=0;i<arr.length;i++){
             sum=sum+arr[i];
         }
        System.out.println(sum);
    }
}
