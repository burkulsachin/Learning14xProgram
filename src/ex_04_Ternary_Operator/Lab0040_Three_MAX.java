package ex_04_Ternary_Operator;

import java.sql.SQLOutput;

public class Lab0040_Three_MAX
{
    public static void main(String[] args) {
//        ## **Logic Building | Coding Interview Crack (LBF)**
//        1. Step 1 -> Find the inputs and outputs - data types and what is the exactly the out put interviewer looking.
//        2. Step 2 - **Rough logic , brute force **- > explain it side by side.
//        3. Step 3 - Write the logic and present the solution (Dry Run).
//        4. Step 4 - Optimize and discussion.
//        5. Step 5 - Edge Cases and extra discussion.

//    Step 1. Find input output and  datatype
//i/p-->> n1, n2,n3
//        o/p=int- max number or string we can message with

int n1= 5, n2=9, n3=-11;

//
////        step 2  Rough logic
//        n1>n2&& n1> n3-->> n1
//                n2>n3 &&n1>n2
//                        n3

//Step 3  Dry run program
        int max =(n1>n2)?(n1>n3)?n1:n3:(n2>n3)?n2:n3;
        System.out.printf("max num is %d",max);
//

//



    }
}
