import java .util.*;
public class Null{
    public static void main(String[] args) {
      List<Integer> v=new Vector<>(); 
        v.add(34);
        v.add(null);
        v.add(null);
        v.add(45);
        System.err.println(v);
        System.err.println(v.size());
        for(int i=0;i<v.size();i++)
        {
            System.err.print( v.get(i) + " ");
        }
    
    
    }
}