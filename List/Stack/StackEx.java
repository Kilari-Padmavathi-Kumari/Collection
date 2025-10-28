import java.util.*;
public class StackEx
{
    public static void main(String[] args) {
        /* LIFO last in first out -stack
           FIFO first in first out - Queue
           Stack is a cls in java which implements the list interface and extends the vector clas and claso represent the LIFO principle
           */ 
        
        Stack<String> books=new Stack<>();
        books.add("red");
        books.add("green");
        books.add(0,"blue");
        System.err.println(books);

        books.remove(1);
        System.err.println(books);

         books.set(1,"yellow");
         System.err.println(books);

         books.get(1);
        System.err.println(books);
        for(String book:books)
        {
            System.err.println(book);
        }
        


    }
} 