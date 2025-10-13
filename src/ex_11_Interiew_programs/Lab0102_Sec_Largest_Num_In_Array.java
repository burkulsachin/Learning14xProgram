package ex_11_Interiew_programs;

public class Lab0102_Sec_Largest_Num_In_Array {
    public static void main(String[] args) {
         int arr[]= {10,6,34,556,7786,343};

          int temp;
// Sort in descending order
          for(int i=0;i<arr.length;i++){
              for(int j=i+1;j<arr.length;j++){
                  if(arr[i]<arr[j]){
                      temp=arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
                  }
              }
        }
        System.out.println("Second largest element: " + arr[1]);

    }
}
