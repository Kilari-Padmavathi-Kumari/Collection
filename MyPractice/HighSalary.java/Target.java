/*Stores a list of integers: [2, 3, 4, 5, 6, 2, 3]
Finds and prints all pairs of numbers from the list whose sum equals a target value (in this case, target = 10).*/

import java.util.*;
public class Target
{
    public static void main(String[] args) {
        List<Integer> obj=Arrays.asList(2,3,4,5,6,2,7);
        //System.err.println(obj);
        int target=10;
        for(int i=0;i<obj.size();i++)
        {
            for(int j=i+1;j<obj.size();j++)
            {
                if(obj.get(i)+obj.get(j)==target)
                {
                     System.err.println(obj.get(i)+" "+obj.get(j));
                }
            }
        }
       
    }
}