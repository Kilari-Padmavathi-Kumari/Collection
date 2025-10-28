import java.util.*;
 public class LinkedListEx
 {
    public static void main(String[] args) {

        List<String> names=new LinkedList<>();      
       // Queue<String> name=new LinkedList<>();    //LinkedList extends both list and Queue Or Deque
        System.err.println(names);
        
         names.add("yogi");
          names.add(0,"kavya");
            names.add("yogi");
              names.add(null);
        System.err.println(names);
           }
 }