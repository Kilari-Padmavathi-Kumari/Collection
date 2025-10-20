import java.util.*;

public class CollectionEx {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Padma");
        names.add("Ravi");
        names.add("Sneha");
        System.err.println(names);

        names.remove("Ravi");
        System.err.println("After remove Ravi : "+names);

        for (String name : names) {
            System.out.println(name);
        }

      
        System.out.println("Total names: " + names.size());
    }
}
