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

    // equals() and hashCode() to avoid duplicates based on id
    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        CustomObj s = (CustomObj) obj;
        return this.id == s.id;
    }
    public static void main(String[] args) {
        LinkedHashSet<CustomObj> students = new LinkedHashSet<>();

        students.add(new CustomObj(101, "Padma"));
        students.add(new CustomObj(102, "Pavan"));
        students.add(new CustomObj(101, "Padma"));                  // duplicate (same id)

        for (CustomObj s : students) {
            System.out.println(s);
        }
    }
}
