/*List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 20, 10);
 Do the following: 
 Find the index of first and last occurrence of 20 
 Remove duplicates from the list
  Reverse the list 
  Find the sum of all elements
Check if the list contains 30 in simple way */

import java.util.*;
public class Reverse
{
  public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 20, 10);

      int first=numbers.indexOf(20);
      int last=numbers.lastIndexOf(20);
      System.err.println("first index of 20 : "+first);
      System.err.println("last index of 20 : "+last);
 
    List<Integer> unique=new ArrayList<>(new LinkedHashSet<>(numbers));
    System.err.println("after removing duplicate ele : "+unique);
     
     Collections.reverse(unique);
     System.err.println("reverse the list : "+unique);

     int sum=0;
     for(int s:numbers)
     {
        sum=sum+s;
     }
      System.err.println("sum of the ele : "+sum);

      System.err.println(numbers.contains(30));
      System.err.println("index of 30 is : "+numbers.indexOf(30));
  }   
}