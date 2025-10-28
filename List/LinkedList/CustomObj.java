import java.util.*;

public class CustomObj {
    int id;
    String name;

    CustomObj(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
    public static void main(String[] args) {
        LinkedList<CustomObj> students = new LinkedList<>();

        students.add(new CustomObj(101, "Padma"));
        students.add(new CustomObj(102, "Pavan"));
        students.add(new CustomObj(103, "Anitha"));

        for (CustomObj s : students) {
            System.out.println(s);
        }
    }
}
