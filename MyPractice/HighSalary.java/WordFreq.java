import java.util.*;
public class WordFreq
{
   public static void main(String[] args) {
       String sentence="hello good morning and hello good evening";

       String[] array=sentence.toLowerCase().split("\\s+");
       Collection<String> list=new ArrayList<>(Arrays.asList(array));
       List<String> count=new ArrayList<>();
       System.err.println(" word freq");
       for(String word:list)
       {
        if(!count.contains(word))
        {
            int freq=Collections.frequency(list, word);
            System.err.println(word+" "+freq);
            count.add(word);
        }
       }
   }
}