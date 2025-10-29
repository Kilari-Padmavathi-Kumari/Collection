import java.util.*;
public class RemoveVal
{
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"padma");
        map.put(5,"josh");
        map.put(7,"yamini");
        map.put(6,"josh");
        map.put(9,"kavya");
        System.err.println(map);
        map.remove(5);
        System.err.println("After remove key : "+map);     // remove using key
        map.remove(6,"josh");
         System.err.println("After remove key : "+map);     // remove using key and value
        for (Map.Entry<Integer,String> en : map.entrySet()) {
            Object key = en.getKey();
            Object val = en.getValue();
            System.err.println(en.getKey()+" "+en.getValue());
            
        }

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<Integer, String> entry = it.next();
            if (entry.getValue().equals("yamini")) 
           {
              it.remove();
               
           }
           
       }
       System.err.println("After remove ele : "+map);
        
    

    }
}