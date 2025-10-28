import java.util.*;

public class LinkedSet {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Padma");
        names.add("Pavan");
        names.add("Anitha");
        names.add("Kiran");
        names.add("Padma"); // duplicate - ignored

        System.out.println("LinkedHashSet: " + names);
    }
}
