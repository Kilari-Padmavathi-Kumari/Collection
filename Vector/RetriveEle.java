

import java.util.List;
import java.util.Vector;

public class RetriveEle {
    public static void main(String[] args) {
        List<String> ve=new Vector<>();
        ve.add("padma");
        ve.add("josh");
        ve.add("kavya");
        
        System.err.println(ve.get(0));
        System.err.println(ve.get(5));
    }
}
