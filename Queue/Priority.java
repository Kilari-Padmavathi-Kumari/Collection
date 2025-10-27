import java.util.*;
public class Priority
{
    public static void main(String[] args) {
       Queue<Integer> pq=new PriorityQueue<>();
        pq.add(8);                                                   // addition -> offer, add
        pq.offer(2);
        pq.add(4);       
        System.err.println(pq);             

        System.err.println(pq.peek());                              //retrival -> peek only head ele retrival
        System.err.println(pq);                                     //peek show the head ele not remove the ele 

       System.err.println(pq.poll());
       System.err.println(pq);      

       while(!pq.isEmpty())
       {
        System.err.println(pq.poll());
       }        

                                
      


      /*Queue<Integer> pq=new PriorityQueue<>();


      System.err.println(pq);              // removal -> poll(o/p null),remove(queue ele remove are use throw an exception )
                                     //remove the head value (head alwaly priority means low ele come to head position)  

        System.err.println(pq.peek());                              
        System.err.println(pq);                                     

       System.err.println(pq.poll());
       System.err.println(pq);

       System.err.println(pq.remove());
       System.err.println(pq);
        */

    }                                                 
                                                        
}