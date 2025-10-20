import java.util.*;

public class Both
{
    public static void main(String[] args) {
        Set<String> data=new HashSet<>();
        data.add("josh");
        data.add("vedha");
        System.err.println(data);                    //output look like Array form

        Iterator<String> datas=data.iterator();
        while(datas.hasNext())
        {
            System.err.println("using Iterator : "+datas.next());
        }

        for(String names:data)
        {
            System.err.println("using Iterable : "+ names );
        }
    }
}