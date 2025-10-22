import java.util.*;

public class Tree
{
    private String Name;
    private List<Integer> noOffruits;
    private int branches;

    public Tree(String Name, int branches, List<Integer> noOffruits) {
        this.Name = Name;
        this.branches = branches;
        this.noOffruits = noOffruits;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public List<Integer> getNoOffruits() {
        return noOffruits;
    }

    public void setNoOffruits(List<Integer> noOffruits) {
        this.noOffruits = noOffruits;
    }

    public int getBranches() {
        return branches;
    }

    public void setBranches(int branches) {
        this.branches = branches;
    }
    public static void main(String[] args) {
        List<Tree> listtree=new LinkedList<>();
       listtree.add(new Tree("kavya",6,List.of(1,2,3,4,5)));
        listtree.add(new Tree("padma",4,List.of(1,2,3,4,5)));
         listtree.add(new Tree("josh",6,List.of(1,2,3,4,5)));
          listtree.add(new Tree("vedha",6,List.of(1,2,3,4,5)));

          for(Tree tree:listtree)
          {
            int result=tree.getNoOffruits().size()+tree.getBranches();  //list size*branches --> 5*6=30
            System.err.println(tree.getName()+" "+result);
          }
          for(Tree tee:listtree)
          {
           
            System.err.println(tee.getName()+" "+tee.getBranches()+" "+tee.getNoOffruits());
          }
    }
    
}