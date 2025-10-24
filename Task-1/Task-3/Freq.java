import java.util.HashMap;
import java.util.Map;

public class Freq {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        String[] words = sentence.toLowerCase().split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : wordCount.keySet()) {
            System.out.println(word + " : " + wordCount.get(word));
        }
    }
}





