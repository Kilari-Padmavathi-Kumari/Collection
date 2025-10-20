
import java.util.*;
import java.util.Iterator;

public class IteratorEx                                //java util
{
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("padma");
        name.add("kavya");
        name.add("josh");
        System.err.println(name);
        Iterator<String> it=name.iterator();
        while(it.hasNext())
        {
            String names=it.next();
            System.err.println(names);
        }
        

    }
}