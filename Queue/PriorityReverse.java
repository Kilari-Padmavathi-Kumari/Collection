import java.util.*;
public class PriorityReverse
{
    public static void main(String[] args) {
       Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(8);                                                   // addition -> offer, add
        pq.offer(2);
        pq.add(4);       
        System.err.println(pq);             
       
       while(!pq.isEmpty())
       {
        System.err.println(pq.poll());
       }
    }
}