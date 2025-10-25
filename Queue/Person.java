import java.util.*;

public class Person {
    private String name;
    private int tasks;

    public Person(String name, int tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() 
    {
         return name; 
    }
    public int getTasks() 
    {
         return tasks;
    }
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Alice", 3));
        queue.add(new Person("Bob", 5));
        queue.add(new Person("Charlie", 2));

        while(!queue.isEmpty()) {
            Person p = queue.poll();  
            int totalWork = p.getTasks() * 2;               //  calculation
            System.out.println(p.getName() + " total work: " + totalWork);
        
    }
}
}