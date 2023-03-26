package Coding_Question;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        System.out.println(countWords(str));
    }
    public static Map<String, Integer> countWords(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> wordFreq = new HashMap<>();

        for(int i =0;i<words.length;i++){
            if (!wordFreq.containsKey(words[i])) {
                wordFreq.put(words[i], 1);
            } else {
                wordFreq.put(words[i], wordFreq.get(words[i]) + 1);
            }
        }

        return wordFreq;
    }
}


//another using treemap
/*
 public static Map<String, Integer> countWords(String text) {
        String[] words = text.split(" ");
        Map<String, Integer> wordFreq = new TreeMap<>();

        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        return wordFreq;
    }
 */