//Implement print queue (FIFO)

import java.util.*;
public class QueueEx
{
    public static void main(String[] args) {
       Queue<String> queue=new PriorityQueue<>();
       queue.add("padma");
       queue.offer("josh");
       queue.add("vedha");
       queue.offer("kavya");

       System.err.println(queue);
       System.err.println("using for loop output are");

       for(String queueset:queue)
       {
        System.err.println(queueset);
       }

      System.err.println(queue.peek());                        //peek show the top ele not remove from the top
      System.err.println("after peek method "+queue);

      System.err.println(queue.poll());                       //poll remove the elefrom top
      System.err.println("after poll method "+queue);


    }
}