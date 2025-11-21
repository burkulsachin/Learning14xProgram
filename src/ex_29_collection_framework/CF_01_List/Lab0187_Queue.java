package ex_29_collection_framework.CF_01_List;

import java.util.PriorityQueue;

public class Lab0187_Queue {
    // Queue -> 0.001% in Automation
    // FIFO
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Pramod");
        q.add("Dutta");
        System.out.println(q); // natural sorting

        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
