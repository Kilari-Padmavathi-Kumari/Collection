import java.util.*;
public class HashMapEx
{
    private String name;
    private int age;

    public HashMapEx(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object obj)
    {
        if(this==obj)
        {
            return true;
        }
        /*if(!(obj instanceof HashMapEx))
        {
            return false;
        }*/
        HashMapEx other=(HashMapEx) obj;
        return this.age==other.age && this.name.equals(other.name);
    }
    public int hashcode()
    {
        return Objects.hash(name,age);
    }
    public String toString()
    {
        return name+" "+age;
    }

    public static void main(String[] args) {
        Map<HashMapEx,String> map=new HashMap<>();
        map.put(new HashMapEx("padma",22),"banana");
        map.put(new HashMapEx("josh",6),"apple");
        map.put(new HashMapEx("vedha",3),"charry");
        map.put(new HashMapEx("kavya",23),"orange");
        for(Map.Entry<HashMapEx,String> en:map.entrySet())
        {
            System.err.println(en.getKey()+" "+en.getValue());
        }

    }
}

/*
import java.util.*;
public class HashMapEx
{
    private String name;
    private int age;

    public HashMapEx(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object obj)
    {
        if(this==obj)
        {
            return true;
        }
        HashMapEx other=(HashMapEx) obj;
        return this.name.equals(other.name);
    }
    public int hashcode()
    {
        return Objects.hash(name,age);
    }
    public String toString()
    {
        return name+" "+age;
    }

    public static void main(String[] args) {
        Map<HashMapEx,String> map=new HashMap<>();
        map.put(new HashMapEx("padma",22),"banana");
        map.put(new HashMapEx("josh",6),"apple");
        map.put(new HashMapEx("vedha",3),"charry");
        map.put(new HashMapEx("kavya",23),"orange");
        for(Map.Entry<HashMapEx,String> en:map.entrySet())
        {
            System.err.println(en.getKey()+" "+en.getValue());
        }

    }
}*/