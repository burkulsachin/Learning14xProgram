package ex_28_exceptions;

public class Lab0169_LabFinalize {
    public static void main(String[] args) {
        Lab0169_LabFinalize labFinalize = new Lab0169_LabFinalize();
        labFinalize = null;
        System.gc();
        System.out.println("main method done");

    }
    public  void finalize(){
        System.out.println("Finalize method called before GC");

    }

}
