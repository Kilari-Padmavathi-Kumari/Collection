/*
Create a List<Book> and add at least 5 books

Print all book details

Find and print the book with the highest price

Sort the list by title and print

Remove books where the price < 300
*/


import java.util.*;
public class BookList
{
    private String bname;
    private String writter;
    private int price;

    public BookList(String bname, int price, String writter) {
        this.bname = bname;
        this.price = price;
        this.writter = writter;
    }
    public static void main(String[] args) {
        List<BookList> blist=new LinkedList<>();
        blist.add(new BookList("maths",300,"raju"));
        blist.add(new BookList("social",400,"josh"));
        blist.add(new BookList("maths",450,"pal"));
       
       for(BookList it:blist)
       {
         System.err.println(it.bname+" "+it.price+" "+it.writter);
       }
       Collections.sort(blist ,(e1,e2) -> Integer.compare(e2.price,e1.price));
       for(BookList highage:blist)
       {
        System.err.println("high age : "+highage.bname+" "+highage.writter+" "+highage.price);
       }

    
        blist.sort(Comparator.comparing(b -> b.writter));
        for(BookList wt:blist)
        {
            System.err.println("top writter : "+wt.bname+" "+wt.writter+" "+wt.price);
        }
        
        blist.removeIf(b -> b.price<400);
         for(BookList b:blist)
        {
            System.err.println(b.price);
        }

            }
}