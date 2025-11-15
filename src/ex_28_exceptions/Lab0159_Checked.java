package ex_28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab0159_Checked {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:/Dses");




        //  // Checked - JVM
        //        // JVM knows about it , During Compilation - JVM is saying that
        //        // there can be case when this file is not found.
        //        //
    }
}
