import java.util.*;
public class Custom
{
    private String name;
    private int age;

    public Custom(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return name+" "+age;
    }
    public static void main(String[] args) {
        Map<Custom,String> map=new HashMap<>();
        map.put(new Custom("banana",2),"fru");
        map.put(new Custom("apple",1),"fru");
        map.put(new Custom("beans",2),"veg");

        for (Map.Entry<Custom,String> en : map.entrySet()) {
            Object key = en.getKey();
            Object val = en.getValue();
            System.err.println(en.getKey()+" "+en.getValue());
            
        }
    }
    
}