package ex_28_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab0166_Throws {
    public static void main(String[] args) throws FileNotFoundException, FileNotFoundException {

        FileReader f = new FileReader(new File("C://abc.txt"));
    }
}
