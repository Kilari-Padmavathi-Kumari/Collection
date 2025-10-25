

import java.util.*;

public class ComparatorEx                 
{
    String name;
    int salary;

    public ComparatorEx(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
   
    public static void main(String[] args) {
        List<ComparatorEx> obj=new ArrayList<>();
        obj.add(new ComparatorEx("ram",24));
        obj.add(new ComparatorEx("pavani",26));
        obj.add(new ComparatorEx("gayatri",20));
         

        System.err.println("using comparator");
        obj.sort(Comparator.comparing(d->d.name));
        
        for(ComparatorEx eobj:obj)
        {
            System.err.println(eobj.name+" "+eobj.salary);
        }
        
    }
}