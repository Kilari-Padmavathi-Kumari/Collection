import java.util.*;
public class Custom
{
    private String name;
    private List<Integer> list;
    private int salary;

    public Custom(String name,List<Integer> list,int salary)
    {
        this.name=name;
        this.list=list;
        this.salary=salary;
    }
    public static void main(String[] args) {
        List<Custom> set=new ArrayList<>();
        set.add(new Custom("padma",List.of(1,2,3,1),28000));
        set.add(new Custom("vineela",List.of(1,72,3,5,6,7),24000));
        set.add(new Custom("vani",List.of(1,2,5,4,3,21),26000));
        set.add(new Custom("varshini",List.of(1,34,5,6,32,1),18000));
        set.add(new Custom("karuna",List.of(1,2,30,31,32,1),15000));

        for(Custom ls:set)
        {
            System.err.println(ls.name+" "+ls.list+" "+ls.salary);
        }

       System.err.println("Custom list sorting");
       Collections.sort(set,(e1,e2) -> Integer.compare(e2.salary,e1.salary));
       for(Custom ls:set)
        {
            System.err.println(ls.name+" "+ls.list+" "+ls.salary);
        }

    }
} 