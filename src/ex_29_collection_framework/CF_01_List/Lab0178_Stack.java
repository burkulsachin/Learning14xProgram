package ex_29_collection_framework.CF_01_List;
import java.util.Stack;
public class Lab0178_Stack {
    static void main(String[] args) {
        Stack s1 = new Stack();
        //  List In and First Out

        Stack s = new Stack();
        s.add("Sachin");
        s.add("Burkul");
        s.add("Sammy");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.add("Snehal"));
        System.out.println(s);
        s.add("Nive");
        s.add("Nive");
        s.push("pawa");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));

    }
}
