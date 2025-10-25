import java.util.*;

public class SimpleEx {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Padma");
        deque.addLast("Kavya");
        deque.addFirst("Josh");
        deque.addLast("Vedha");

        System.out.println("Deque: " + deque);

        String first = deque.removeFirst();  
        String last = deque.removeLast();    

        System.out.println("Removed First: " + first );
        System.err.println("Removed Last : "+last);
        System.out.println("Deque now: " + deque);
    }
}
