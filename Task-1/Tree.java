import java.util.*;
public class Tree
{
    String name;
    String noOffruits;

    public Tree(String name, String noOffruits) {
        this.name = name;
        this.noOffruits = noOffruits;
    }
     
    public static void main(String[] args) {
        Tree tree=new Tree("padma","apple");
        Tree tree1=new Tree("kavya","banana");
        Tree tree2=new Tree("josh","cherry");
        Tree tree3=new Tree("vedha","orange");


        List<Tree> ls=new LinkedList<>();
        ls.add(tree);
        ls.add(tree1);
        ls.add(tree2);
        ls.add(tree3);

        System.err.println("list outputs");
      
        for(Tree listtree:ls)
        {
            System.err.println(listtree.name+">>>"+listtree.noOffruits);
        }

        Set<Tree> hs=new HashSet<>();
        hs.add(tree);
        hs.add(tree1);
        hs.add(tree2);
        hs.add(tree3);
        System.err.println();

        System.err.println("set outputs");
        
        for(Tree hashtree:hs)
        {
            System.err.println(hashtree.name+">>>"+hashtree.noOffruits);
        }
    }
}