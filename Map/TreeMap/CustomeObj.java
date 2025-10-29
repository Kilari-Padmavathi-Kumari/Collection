import java.util.*;

public class CustomeObj implements Comparable<CustomeObj> {
    private int id;
    private String name;

    public CustomeObj(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(CustomeObj s) {
        return this.id - s.id;                            // sort by id
    }

    public String toString() {
        return id + " - " + name;
    }
    public static void main(String[] args) {
        TreeMap<CustomeObj, String> map = new TreeMap<>();

        map.put(new CustomeObj(103, "Padma"), "HR");
        map.put(new CustomeObj(101, "Pavan"), "Developer");
        map.put(new CustomeObj(102, "Anitha"), "Tester");

        System.out.println("Employees Sorted by ID:");
        for (Map.Entry<CustomeObj, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
