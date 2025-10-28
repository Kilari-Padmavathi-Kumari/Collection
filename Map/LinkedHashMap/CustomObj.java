import java.util.*;

public class CustomObj {
    private int id;
    private String name;

   public CustomObj(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }

    public static void main(String[] args) {
        LinkedHashMap<Integer, CustomObj> students = new LinkedHashMap<>();

        students.put(101, new CustomObj(101, "Padma"));
        students.put(102, new CustomObj(102, "Pavan"));
        students.put(103, new CustomObj(103, "Anitha"));

        for (Map.Entry<Integer, CustomObj> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
