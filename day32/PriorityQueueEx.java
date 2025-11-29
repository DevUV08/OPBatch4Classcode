import java.util.PriorityQueue;
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> q= new PriorityQueue<>();
        // insert 
        q.add(5);
        q.add(6);
        q.add(3);
        q.add(1);
        System.out.println(q);
        // size 
        System.out.println("Size : "+ q.size());
        // check empty 
        System.out.println(q.isEmpty());
        // peek 
        System.out.println("Peek: "+ q.peek());
        // remove 
        System.out.println(q.poll());
        q.poll();
        System.out.println(q);
    }
}
