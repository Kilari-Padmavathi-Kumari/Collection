import java.util.*;
public class StackMethod
{
    public static void main(String[] args) {
        Stack<String> names=new Stack<>();
        System.err.println(names.size());
        names.push("red");
        names.push("white");                           //stack extend vector 1.0 legice class
        
        names.indexOf("red");
        names.push("black");
        names.indexOf("red");
        names.indexOf(null);
        System.err.println(names);
        
        System.err.println("using peek :"+names.peek());         // only show the last ele
        System.err.println(names);
      
        System.err.println("using pop : " +names.pop());         // remove the last ele
        System.err.println(names);
                                                                                                                              //  | 1 |
        System.err.println("using search : "+ names.search("red"));   //  search the ele in top of the stack (index starts 1)     | 2 |
        System.err.println(names);

        System.err.println("using indexOf : "+ names.indexOf("red"));           // index bottom to top
        System.err.println(names);

        
        System.err.println(names.isEmpty());     //  elecount 
        System.err.println(names.empty());       //size
    }
}