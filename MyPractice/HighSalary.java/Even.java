//Create a List<Integer> and print all even numbers.

import java.util.*;

public class Even 
{
    public static void main(String[] args) {
        List<Integer> even=Arrays.asList(1,4,2,6,10,9,8,7);
        System.err.println(even);
       Collections.sort(even);
       int count=0;
        for(int numbers:even)
        {
            if(numbers%2==0)
            {
                count++;
                System.err.println(numbers);
            }

        }
        System.err.println("total even number are :"+count);

    }
}