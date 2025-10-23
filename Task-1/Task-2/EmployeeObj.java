 /*Sorting & Comparators
Sort Employee objects using Comparable and Comparator.*/

import java.util.*;

public class EmployeeObj implements Comparable<EmployeeObj>                   //using comparable Implements the complarable interface and sort the values
{
    String name;
    int salary;

    public EmployeeObj(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int compareTo(EmployeeObj others)
    { 
       return this.salary-others.salary;
    }
    public static void main(String[] args) {
        List<EmployeeObj> obj=new ArrayList<>();
        obj.add(new EmployeeObj("ram",2400));
        obj.add(new EmployeeObj("pavani",2600));
        obj.add(new EmployeeObj("gayatri",2000));
         

        System.err.println("using comparable");
        Collections.sort(obj);
        for(EmployeeObj eobj:obj)
        {
            System.err.println(eobj.name+" "+eobj.salary);
        }
        System.err.println("using comparator");
        Collections.sort(obj,(e1,e2) -> Integer.compare(e2.salary,e1.salary));
        for(EmployeeObj m:obj)
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