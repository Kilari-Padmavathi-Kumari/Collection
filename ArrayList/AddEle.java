import java.util.*;
public class AddEle {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");  // duplicates allowed

       // System.out.println(list);
       
       Object[] arr=list.toArray();
       System.err.println(Arrays.toString(arr));
    }
}
