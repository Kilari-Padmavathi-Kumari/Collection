import java.util.*;

public class HashEx {
    private int id;
    private String name;
    private int marks;

    public HashEx(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + marks + ")";
    }

    public static void main(String[] args) {

        Comparator<HashEx> sortByMarksDescThenName = (s1, s2) -> Integer.compare(s1.id,s2.id);
            

        TreeMap<HashEx, String> studentMap = new TreeMap<>(sortByMarksDescThenName);

        studentMap.put(new HashEx(101, "Padma", 90), "Developer");
        studentMap.put(new HashEx(102, "Pavan", 95), "Manager");
        studentMap.put(new HashEx(103, "Anu", 90), "Tester");
        studentMap.put(new HashEx(104, "Kiran", 88), "Designer");

        for (Map.Entry<HashEx, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
