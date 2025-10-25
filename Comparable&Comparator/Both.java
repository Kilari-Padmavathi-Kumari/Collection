 /*Sorting & Comparators
Sort Employee objects using Comparable and Comparator.*/

import java.util.*;

public class Both implements Comparable<Both>                   //using comparable Implements the complarable interface and sort the values
{
    String name;
    int salary;

    public Both(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int compareTo(Both others)
    { 
       return this.salary-others.salary;
    }
    public static void main(String[] args) {
        List<Both> obj=new ArrayList<>();
        obj.add(new Both("ram",2400));
        obj.add(new Both("pavani",2600));
        obj.add(new Both("gayatri",2000));
         

        System.err.println("using comparable");
        Collections.sort(obj);
        for(Both eobj:obj)
        {
            System.err.println(eobj.name+" "+eobj.salary);
        }
        System.err.println("using comparator");
        Collections.sort(obj,(e1,e2) -> Integer.compare(e2.salary,e1.salary));
        for(Both m:obj)
        {
            System.err.println(m.name+" "+m.salary);
        }
        
        /*obj.sort(Comparator.comparing(d -> d.name));
        for(EmployeeObj m:obj)
        {
            System.err.println(m.name+" "+m.salary);
        }*/

    }
}