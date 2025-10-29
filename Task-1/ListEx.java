import java.util.*;
public class ListEx
{
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(10);
         list.add(50);
          list.add(30);
           list.add(20);
           System.err.println(list);
        for(Integer e:list)
        {
            list.remove(e);
            System.err.println(e);
        }
    }
}