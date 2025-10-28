import java.util.*;
public class TreeSetEx implements Comparable<TreeSetEx>
{
   private String name;
    private int id;
    public TreeSetEx(String name,int id)                    
    {
        this.name=name;
        this.id=id;
    }
    public int compareTo(TreeSetEx other)
    {
        return this.id-other.id;
    }
    public static void main(String[] args) {
        Set<TreeSetEx> treeset=new TreeSet<>();
        treeset.add(new TreeSetEx("ramu",2));
        treeset.add(new TreeSetEx("padma",7));
        treeset.add(new TreeSetEx("kavya",1));
        treeset.add(new TreeSetEx("josh",5));

        for(TreeSetEx treesort:treeset)
        {
            System.err.println(treesort.name+" "+treesort.id);
        }
    }

}