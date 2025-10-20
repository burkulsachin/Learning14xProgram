package ex_12_Arrays;

public class Lab0107_SUM_OF_ARRAYS {
    public static void main(String[] args) {
        int[] num={2,3,4,2,44,55,66,77,88,88,77,43};
        int sum =0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];

        }
        System.out.println(sum);
    }
}
