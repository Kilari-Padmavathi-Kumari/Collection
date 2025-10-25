import java.util.*;

public class LifoFifo {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.push(10);
        dq.push(20);                            //Lifo
        dq.push(30);
        System.out.println("Stack LIFO : " + dq);

        dq.pop(); 
        System.out.println("After pop : " + dq);

        
        dq.clear();
        dq.offer(1);                          //FIFO
        dq.offerFirst(2);
        dq.offerLast(3);
        System.out.println("Queue FIFO : " + dq);

        dq.poll();  
        System.out.println("After poll: " + dq);
    }
}
