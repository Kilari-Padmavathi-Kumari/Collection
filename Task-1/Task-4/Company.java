import java.util.*;

class Employee {
    String name;
    Set<String> skills = new HashSet<>();
    Employee(String name) 
    {
        this.name = name; 
    }
}

class Department {
    String name;
    List<Employee> emps = new ArrayList<>();
    Department(String name) 
    {
         this.name = name;
    }
}

class Company {
    List<Department> depts = new ArrayList<>();

    void addDept(String name) 
    { 
        depts.add(new Department(name)); 
        
    }

    void removeDept(String name) 
    {
         depts.removeIf(d -> d.name.equals(name));
    }
   void show() {
        for (Department s : depts) {
            System.out.println(s.name);
        }
    }
    
   

    public static void main(String[] args) {
        Company c = new Company();
        c.addDept("IT");
        c.addDept("HR");
        c.show();
        c.removeDept("IT");
        System.err.println("After removing dept : ");
        c.show();
      
    }
}