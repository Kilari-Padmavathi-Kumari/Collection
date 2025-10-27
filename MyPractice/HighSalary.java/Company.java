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

    void addEmp(String dept, String emp) 
    {
        for (Department d : depts)
        {
        if (d.name.equals(dept)) d.emps.add(new Employee(emp));
        }
    }

    void removeEmp(String dept, String emp)
     {
        for (Department d : depts)
        {
            if (d.name.equals(dept)) d.emps.removeIf(e -> e.name.equals(emp));
        }
    }

    void addSkill(String dept, String emp, String skill) {
        for (Department d : depts)
            if (d.name.equals(dept))
                for (Employee e : d.emps)
                    if (e.name.equals(emp)) e.skills.add(skill);
    }

    void showSkill(String skill) {
        for (Department d : depts)
            for (Employee e : d.emps)
                if (e.skills.contains(skill))
                    System.out.println(e.name + " - " + d.name);
    }

    public static void main(String[] args) {
        Company c = new Company();
        c.addDept("IT");
        c.addDept("HR");
        c.addEmp("IT", "Ravi");
        c.addEmp("HR", "Priya");
        c.addSkill("IT", "Ravi", "Java");
        c.addSkill("HR", "Priya", "Communication");
        c.showSkill("Java");
    }
}