import java.util.*;
public class DequeEx
{
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque<>();       // Deque<String> dq=new Linkedlist<>(); linkedlist act list(nodes) and Queue(double end Queue) 
        dq.add("banana");
        dq.addFirst("cherry");
        dq.offer("orange");
        dq.offerLast("grape");
        dq.add("apple");
        dq.offerFirst("kiwi");

        System.err.println(dq);

        System.err.println(dq.peekFirst());
        System.err.println(dq);

        System.err.println(dq.peekLast());
        System.err.println(dq);

        System.err.println(dq.pollFirst());
        System.err.println(dq);
    }
}