package ex_15_OOPs;

public class Lab0121_Constructor {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2 = new Student("Sachin");
    }




}
class Student {

     Student(){
//Default constructor
         System.out.println("Hi default constructor called");

     }
     //Parameterized constructor
    Student(String name){
        System.out.println("Parameterized constructor "+name);
    }

}