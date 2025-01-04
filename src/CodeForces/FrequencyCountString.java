package CodeForces;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCountString {
    public static void main(String[] args) {
        String str = "googlemaplin";
        System.out.println(countCharFrequencies(str));
    }
        public static Map<Character, Integer> countCharFrequencies(String str) {
            // Initialize an empty hashmap to store the frequencies
            Map<Character, Integer> frequencyMap = new HashMap<>();

            // Iterate through the string and count the frequencies
            char[] ans = str.toCharArray();
            for (int i =0;i<ans.length;i++) {
                frequencyMap.put(ans[i], frequencyMap.getOrDefault(ans[i], 0) + 1);
            }

            return frequencyMap;
        }

    }

