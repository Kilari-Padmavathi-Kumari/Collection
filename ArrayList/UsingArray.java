
import java.util.ArrayList;
import java.util.*;

public class UsingArray
{
    public static void main(String[] args) {
        Integer[] arr=new Integer[] {1,2,5,3,7};
        Collection<Integer> l=new ArrayList<>(Arrays.asList(arr));
        l.add(9);
        l.add(null);
        System.err.println(l);
        System.err.println(l.size());
        //Collections.synchronizedList(l);
    }
}