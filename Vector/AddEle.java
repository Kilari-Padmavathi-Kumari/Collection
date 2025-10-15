/*
import java.util.*;

public class AddEle {
    public static void main(String[] args) {
        List<String> ve=new Vector<>();
        ve.add("padma");
        ve.add("josh");
        ve.add("kavya");

         List<String> nve=new Vector<>();
         nve.add("bujji");
         nve.add("vedha");
        
         for(int i=0;i<nve.size();i++)
         {
            ve.add(nve.get(i));
         }
         System.err.println(ve);
    }
}*/


import java.util.*;

public class AddEle {
    public static void main(String[] args) {
        List<String> ve=new Vector<>();
        ve.add("padma");
        ve.add("josh");
        ve.add("kavya");

         List<String> nve=new Vector<>();
         nve.add("bujji");
         nve.add("vedha");
         
          ve.addAll(nve);
         System.err.println(ve);
    }
}

