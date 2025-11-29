import java.util.ArrayDeque;
public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<Integer> q= new ArrayDeque<>();
        // insert values 
        q.addFirst(2);
        q.addFirst(1);
        q.add(3);
        q.addFirst(4);
        q.addLast(5);
        System.out.println(q);
        // size 
        System.out.println("Size: "+q.size());
        // check empty
        System.out.println(q.isEmpty());
        // remove 
        q.removeFirst();
        System.out.println(q);
        q.removeLast();
        System.out.println(q);
        // peek 
        System.out.println("peek: "+q.peek());
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());
        // clear 
        q.clear();
        System.out.println(q);
    }
}
