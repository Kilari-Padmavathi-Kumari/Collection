import java.util.*;

public class LinkedMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(101, "Padma");
        map.put(102, "Pavan");
        map.put(103, "Anitha");
        map.put(104, "Kiran");

        System.out.println("LinkedHashMap: " + map);
    }
}
