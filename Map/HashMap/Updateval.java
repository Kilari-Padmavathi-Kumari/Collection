import java.util.*;
class Updateval
{
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"padma");
        map.put(4,"kavya");
        map.put(5,"pandu");
        map.put(4,"josh");
        map.put(3,"vedha");
        System.err.println(map);
        System.err.println("keys : "+map.keySet());
        System.err.println("values : "+map.values());
        System.err.println("key value set :");
        for(Map.Entry<Integer,String> entry:map.entrySet())
        {
            if(entry.getValue().equals("pandu"))
            {
                entry.setValue("hemu");
            }
            System.err.println(+entry.getKey()+" "+entry.getValue());
        }
       
    }
}

/*

import java.util.*;

public class Updateval {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("Before remove: " + map);

        // Remove key 2
        map.remove(2);

        System.out.println("After remove: " + map);
    }
}*/
