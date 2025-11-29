import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        // insert the values 
        q.add(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q);
        // size 
        System.out.println("Size: "+q.size());
        // peek or front
        System.out.println("Peek: "+q.peek());
        // remove
        System.out.println("Removed front: "+q.poll());
        // check empty 
        System.out.println(q.isEmpty());
        // clear all the values 
        q.clear();
        System.out.println(q.isEmpty());
    }
}