import java.util.*;
public class HashEx
{
    public static void main(String[] args) {
        Set<Integer> hs=new HashSet<>();
        hs.add(2);
        hs.add(45);
        hs.add(45);                                //ele store in random order
        hs.add(65);                                 // duplicte value are not allowed
        hs.add(5);
        hs.add(4);
        System.err.println(hs);
        hs.remove(45);
        System.err.println("After removing ele : "+hs);

    }
}