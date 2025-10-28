import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(103, "Anitha");
        map.put(101, "Padma");
        map.put(102, "Pavan");

        System.out.println("TreeMap: " + map);

        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());
    }
}
