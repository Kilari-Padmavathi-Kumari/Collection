
import java.util.*;

public class ComparableEx implements Comparable<ComparableEx>                   //using comparable Implements the complarable interface and sort the values
{
    private String name;
    private int salary;

    public ComparableEx(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int compareTo(ComparableEx others)
    { 
       return this.salary-others.salary;
    }
    public static void main(String[] args) {
        List<ComparableEx> obj=new ArrayList<>();
        obj.add(new ComparableEx("ram",24));
        obj.add(new ComparableEx("pavani",26));
        obj.add(new ComparableEx("gayatri",20));
         

        System.err.println("using comparable");
        Collections.sort(obj);
        for(ComparableEx eobj:obj)
        {
            System.err.println(eobj.name+" "+eobj.salary);
        }
        
    }
}
