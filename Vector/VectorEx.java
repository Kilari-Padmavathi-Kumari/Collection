package Collection.Vector;

import java.util.*;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> ve=new Vector<>();
        System.err.println(ve);
        ve.add("padma");
        ve.add("kavya");
        ve.add("josh");
        System.err.println(ve);
        ve.add(0,"vedha");
        System.err.println(ve);
        System.err.println("size : "+ve.size());
        System.err.println("capacity : "+ve.capacity());
    }
}
