import java.util.*;

public class FailFast {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String s : list) {
            System.out.println(s);
            
            list.add("D"); 
        }
    }
}
