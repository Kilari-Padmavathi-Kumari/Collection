import java.util.*;

public class IterationEx {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Padma", 95);
        marks.put("Pavan", 90);
        marks.put("Anitha", 85);

        System.out.println("Using entrySet():");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUsing keySet():");
        for (String key : marks.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nUsing values():");
        for (Integer value : marks.values()) {
            System.out.println(value);
        }
    }
}
