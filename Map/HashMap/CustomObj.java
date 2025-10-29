import java.util.*;

class Custom
{
    private String fruit;
    private int price;

    public Custom(String fruit,int price)
    {
        this.fruit=fruit;
        this.price=price;
    }
    public String toString()
    {
        return fruit+" "+price;
    }
}

public class CustomObj
{
    private String name;
    private int age;

    public CustomObj(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return name+" "+age;
    }
    public static void main(String[] args) {
        Map<CustomObj,Custom> map=new HashMap<>();
        map.put(new CustomObj("padma",22),new Custom("banana",90));
        map.put(new CustomObj("kavya",19),new Custom("apple",30));
        map.put(new CustomObj("josh",7),new Custom("cherry",90));

        for (Map.Entry<CustomObj,Custom> en : map.entrySet()) {
            System.err.println(en.getKey()+" "+en.getValue());
            
        }
    }
    
}