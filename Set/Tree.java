import java.util.*;

class Tree {
    private String name;
    private int noOfFruits;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setNoOfFruits(int noOfFruits) {
        this.noOfFruits = noOfFruits;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getNoOfFruits() {
        return noOfFruits;
    }
    public static void main(String[] args) {
        // Create Tree objects
        Tree t1 = new Tree();
        t1.setName("Mango");
        t1.setNoOfFruits(50);

        Tree t2 = new Tree();
        t2.setName("Apple");
        t2.setNoOfFruits(30);

        Tree t3 = new Tree();
        t3.setName("Banana");
        t3.setNoOfFruits(100);

        // Store in List
        List<Tree> treeList = new ArrayList<>();
        treeList.add(t1);
        treeList.add(t2);
        treeList.add(t3);

        // Store in Set
        Set<Tree> treeSet = new HashSet<>();
        treeSet.add(t1);
        treeSet.add(t2);
        treeSet.add(t3);

        // Print from List
        System.out.println("Trees in List:");
        for (Tree tree : treeList) {
            System.out.println(tree.getName() + " -> Fruits: " + tree.getNoOfFruits());
        }

        // Print from Set
        System.out.println("\nTrees in Set:");
        for (Tree tree : treeSet) {
            System.out.println(tree.getName() + " -> Fruits: " + tree.getNoOfFruits());
        }
    }
}

