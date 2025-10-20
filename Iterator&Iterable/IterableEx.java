
import java.util.*;

public class IterableEx
{                                                         // java lang
    public static void main(String[] args) {
        Set<String> data=new HashSet<>();
        data.add("josh");
        data.add("vedha");
        System.err.println(data);                    //output look like Array form
        for(String names:data)
        {
            System.err.println(names);
        }
    }
}