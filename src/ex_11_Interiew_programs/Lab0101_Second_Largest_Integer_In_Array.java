package ex_11_Interiew_programs;

public class Lab0101_Second_Largest_Integer_In_Array {
    public static void main(String[] args) {

        int [] arr ={2,3,5,4,78,98,90};

        for (int i=0;i<arr.length;i++){
            if(arr[i]>arr[0]){
                 arr[0]=arr[i];
            }
        }
        System.out.println(arr[0]);

    }
}
