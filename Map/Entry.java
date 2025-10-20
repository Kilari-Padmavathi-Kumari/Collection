import java.util.*;
import java.util.Map;
public class Entry
{
    public static void main(String[] args) {
        Map<Integer,String> ma=new HashMap<>();
        ma.put(1,"padma");
        ma.put(2,"kavya");
        ma.put(3,"josh");
        System.err.println(ma); 
        Set<Map.Entry<Integer,String>> en=ma.entrySet();
        for (Map.Entry<Integer,String> e : en) {
           Integer key = e.getKey();
            String val = e.getValue();
            System.err.println(key+">>>"+val );
            
        }

    }
}