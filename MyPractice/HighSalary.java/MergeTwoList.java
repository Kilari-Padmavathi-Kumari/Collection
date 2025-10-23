/*Create a program to merge two lists, remove duplicates, and sort the final list in ascending order.*/

import java.util.*;
public class MergeTwoList 
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,4,5,6);
        List<Integer> newlist=Arrays.asList(9,8,7,6,3,21,1);
          List<Integer> mergelist=new ArrayList<>(list);
          mergelist.addAll(newlist);
          System.err.println("merging Both List : "+mergelist);
      List<Integer> unique=new LinkedList<>(new HashSet<>(mergelist));
          System.err.println("Unique ele : "+unique);
        
         Collections.sort(unique);
         System.err.println("after sorting ele : "+unique);
          
    }
}