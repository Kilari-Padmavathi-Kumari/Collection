/*import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");                                        //words sorting 
        list.add("Python");
        list.add("Java");  // duplicates allowed
        System.out.println(list);
        Collections.sort(list);
        System.err.println(list);
    }
}*/
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(43);
        list.add(4);  // duplicates allowed
        System.out.println(list);
        Collections.sort(list);
        System.err.println("asc : "+list);
        Collections.reverse(list);
        System.err.println("reverse : "+list);
        list.clear();
        System.err.println(list);
    }
}
