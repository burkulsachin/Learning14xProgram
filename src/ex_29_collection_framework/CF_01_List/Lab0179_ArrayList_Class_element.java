package ex_29_collection_framework.CF_01_List;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Lab0179_ArrayList_Class_element {
    public static void main(String[] args) {
        Student student = new Student("Sachin","21");
        Student student1 = new Student("Shyam","22");
        Student student2 = new Student("Amol","23");

        List list = new ArrayList();
        list.add(student);
        list.add(student1);
        list.add(student2);

        student.printDetails();
        student1.printDetails();
        student2.printDetails();

    }
}
class  Student extends  Object{
    public Student(String name , String rollNo)
    {
        this.name= name ;
        this.rollNo=rollNo;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    private String  name;
     private  String  rollNo;

     public  void printDetails(){
         System.out.println("Student Name : "+this.name);
         System.out.println("Student ROll Number :"+ this.rollNo    );
     }

}