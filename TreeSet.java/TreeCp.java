import java.util.*;
public class TreeCp
{
   private String name;
    private int id;
    public TreeCp(String name,int id)                    
    {
        this.name=name;
        this.id=id;
    }
    public static void main(String[] args) {
        Comparator<TreeCp> comparator=(e1,e2) -> e1.name.compareTo(e2.name);
        Set<TreeCp> treeset=new TreeSet<>(comparator);
        treeset.add(new TreeCp("ramu",2));
        treeset.add(new TreeCp("padma",7));
        treeset.add(new TreeCp("kavya",1));
        treeset.add(new TreeCp("josh",5));

        for(TreeCp treesort:treeset)
        {
            System.err.println(treesort.name+" "+treesort.id);
        }
    }

}