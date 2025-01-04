package Coding_Question;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordCounterEvery {

    public static void main(String[] args) {
        String text = "This is a sample text with several words. This is a test. This test is a simple test.";

        // Convert the string to lowercase and split it into words
        String[] words = text.toLowerCase().split("\\s+");

        // Use a TreeMap to store word counts and maintain sorted order
        Map<String, Integer> wordCounts = new TreeMap<>();

        // Iterate through the words and count their occurrences
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        // Print the word counts
        wordCounts.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
