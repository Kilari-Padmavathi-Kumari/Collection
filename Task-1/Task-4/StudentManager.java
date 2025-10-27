import java.util.*;

class Student {
    String name;
    int rollNo;
    List<String> courses = new ArrayList<>();

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class StudentManager {
    List<Student> list = new ArrayList<>();

    void addStudent(String name, int rollNo) {
        list.add(new Student(name, rollNo));
    }

    void removeStudent(int rollNo) {
        for (Student s : list) {
            if (s.rollNo == rollNo) {
                list.remove(s);
                break;
            }
        }
    }

    void enrollCourse(int rollNo, String course) {
        for (Student s : list) {
            if (s.rollNo == rollNo) {
                s.courses.add(course);
                break;
            }
        }
    }

    void show() {
        for (Student s : list) {
            System.out.println(s.name + " " + s.rollNo + " " + s.courses);
        }
    }

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.addStudent("Ravi", 1);
        sm.addStudent("Priya", 2);
        sm.addStudent("pavani", 3);
        sm.enrollCourse(1, "Math");
        sm.enrollCourse(2, "Science");
        sm.enrollCourse(3, "social");
        sm.show();
        sm.removeStudent(1);
        System.err.println("After removing List are : ");
        sm.show();
    }
}