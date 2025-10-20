import java.util.*;
public class HashTableEx
{
    public static void main(String[] args) {
        Map<Integer,String> ma=new Hashtable<>();
         ma.put(1,"hyderabad");
         ma.put(2,"vzm");
         ma.put(3,"Srikakulam");
         System.err.println(ma);

        //System.err.println(ma.keySet());
        Collection<Integer> keys=ma.keySet();
        for(int key:keys)                                    //retrieval of only keys from the map
        {
            System.err.println("retrieval keys : "+key);
        }

        //System.err.println(ma.values());
         Collection<String> value=ma.values();
        for(String values:value)                                     //retrieval of only values from the map
        {
            System.err.println("retrieval values : "+values);
        }

        System.err.println("get key value : "+ma.get(1));

        for(int key:keys)
        {
            System.err.println(key+" >>"+ma.get(key));
        }

        System.err.println(ma);
        System.err.println(ma.remove(1));                               //remove form the list
        System.err.println(ma);

        System.err.println(ma.containsKey(0));                        // contain key or not (t/f)
          System.err.println(ma.containsValue("vzm"));               // contain value or not (t/f)

        System.err.println(ma);
        ma.put(2,"srikaklam");
        System.err.println(ma);


        System.err.println(ma.putIfAbsent(0,"nellimarla"));                // value not change
        System.err.println(ma);
        System.err.println(ma.put(0,"nellimarla"));                          //value change

        ma.replace(0, "vzg");                                                       // replace and put same 
        System.err.println(ma);
        System.err.println(ma.size());
        ma.clear();
        System.err.println(ma);
    }
}