/*Create a List<String> of fruits and perform the following:

Add 5 fruits

Remove one fruit by name or index

Access a fruit by index

Replace one fruit using set()

Print all fruits using for-each and Iterator*/

import java.util.*;
public class BasicTask
{
   public static void main(String[] args) {
       List<String> list=new LinkedList<>();
       list.add("orange");
       list.add("mango");
       list.add("cherry");
       list.add("apple");
       list.add("banana");
       System.err.println(list);
       list.remove(0);
       System.err.println("After remove ele List is : "+list);
       System.err.println("access the ele : "+list.get(2));
       System.err.println("replce ele "+list.set(0,"padma"));
       System.err.println("after replace ele is : "+list);

       for(String listele:list)
       {
        System.err.println(listele);
       }

       Iterator<String> it=list.iterator();
       while(it.hasNext()) {
           String elem =  it.next();
           System.err.println("iterator ele : "+elem);
           
       }
   }
}