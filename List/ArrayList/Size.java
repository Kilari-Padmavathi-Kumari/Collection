
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class Size{
    public static void main(String[] args) {
        Collection<Integer> l=new ArrayList<>();
        System.err.println("initial size : "+l.size());
       l.add(10);
       l.add(34);

       System.err.println(l);
       System.err.println("after insert values size is : "+l.size()); 
    }
}