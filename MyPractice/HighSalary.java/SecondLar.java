//Write a program to find the second largest number in a list of integers without sorting.
import java.util.*;
public class SecondLar
{
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(12,3,4,5,3);

        int lar=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;

        for(int number:numbers)
        {
            if(number>lar)
            {
                sec=lar;
                lar=number;
            }
            else if(number>sec && number<lar)
            {
                sec=number;
            }
        }
        System.err.println(lar);
        System.err.println(sec);
    }
}