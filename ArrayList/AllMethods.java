
import java.util.*;

public class AllMethods
{
    public static void main(String[] args) {
        Collection<String> names=new ArrayList<>();
        names.add("kavya");
        names.add("josh");
        names.add("padma");
        System.err.println(names);

        names.remove("padma");
        System.err.println(names);
        

        Collection<String> name1=new LinkedList<>();
        name1.add("vedha");
        name1.add("bujji");

        System.err.println(name1);

        System.err.println(names.addAll(name1));
        System.err.println(names);

        System.err.println(names.removeAll(name1));
        System.err.println(names);

        System.err.println(names.contains("josh"));
        System.err.println(names.containsAll(name1));
        System.err.println(names);

        System.err.println(names.isEmpty());
        System.err.println(names.size());
        


    }
} 