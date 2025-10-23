//Custom sort by salary, name, or department

import java.util.*;
 public class CustomSort
 {
    private String name;
    private double salary;
    private String department;

    public CustomSort(String department, String name, double salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }
   public static void main(String[] args) {
       List<CustomSort> list=new LinkedList<>();
       list.add(new CustomSort("Cse","vedha",2000));
       list.add(new CustomSort("Ece","josh",1000));
       list.add(new CustomSort("poly","kavya",2500));
       list.add(new CustomSort("mech","pandu",2200));
       list.add(new CustomSort("Civil","pavani",2200));

       for(CustomSort sort:list)
       System.err.println(sort.name+" "+sort.department+" "+sort.salary);

        System.err.println("print custom obj in order");

       Collections.sort(list ,(e1,e2) -> Double.compare(e2.salary, e1.salary));  // sorting the salary
       for(CustomSort sort:list)
       System.err.println(sort.name+" "+sort.department+" "+sort.salary);

         System.err.println("sort custom obj using names");
  
       list.sort(Comparator.comparing((d )->d.name));                            // sorting the name
       for(CustomSort sort:list)
       System.err.println(sort.name+" "+sort.department+" "+sort.salary);

       System.err.println("sort custom obj using department");

       list.sort(Comparator.comparing((d )->d.department));                     // sorting the department
       for(CustomSort sort:list)
       System.err.println(sort.name+" "+sort.department+" "+sort.salary);

        
   }
 }