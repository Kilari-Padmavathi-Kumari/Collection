import java.util.*;
public class Student
{
    int id;
    String name;
    String dept;

    public Student(String dept, int id, String name) {
        this.dept = dept;
        this.id = id;
        this.name = name;
    }
 public static void main(String[] args) {
     List<Student> list=new ArrayList<>();
     list.add(new Student("cse",1,"ram"));
     list.add(new Student("eee",2,"josh"));
     list.add(new Student("mech",4,"ramya"));
     list.add(new Student("civil",7,"rajini"));
     list.add(new Student("ece",18,"kavya"));

     Collections.sort(list,(e1,e2) -> Integer.compare(e1.id,e2.id));
     for(Student lists:list)
     {
      System.err.println(lists.id+" "+lists.name+" "+lists.dept);
     }
     

     
 }
}