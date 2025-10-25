import java.util.*;

class Student {
    private String name;
    private int grade;
    private List<String> subjects;

    public Student(String name, int grade, List<String> subjects) {
        this.name = name;
        this.grade = grade;
        this.subjects = subjects;
    }

    public String getName() 
    { 
        return name; 
    }
    public int getGrade() 
    {
         return grade; 
    }
    public List<String> getSubjects() 
    {
         return subjects; 
    }

    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student("Alice", 5, List.of("Math", "Science", "English")));
        students.add(new Student("Bob", 4, List.of("History", "Math")));
        students.add(new Student("Charlie", 6, List.of("Physics", "Chemistry", "Biology", "Math")));

        for (Student s : students) {
            int total = s.getSubjects().size() + s.getGrade();
            System.out.println(s.getName() + " " + total);
        }

        for (Student s : students) {
            System.out.println(s.getName() + " Grade: " + s.getGrade() + " Subjects: " + s.getSubjects());
        }
    }
}
