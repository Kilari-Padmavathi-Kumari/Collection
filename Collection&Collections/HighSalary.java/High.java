import java.util.*;
public class High
{
    private int id;
    private String name;
    private double salary;
    High(int id,String name,double salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public static void main(String[] args) {
        List<High> high=new ArrayList<>();
        high.add(new High(101,"padma",20000));
        high.add(new High(102,"kavya",30000));
        high.add(new High(103,"josh",40000));
        Collections.sort(high ,(e1,e2)->Double.compare(e2.salary,e1.salary));
        for(High sal:high)
        {
            System.err.println(sal.id+" "+sal.name+" "+sal.salary);
        }
    }
}