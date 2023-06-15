package Zap;


import java.util.*;

//public class Practice {
//    public static void main(String[] args) {
////        int[] arr = {9,4,1,7};
////        List<Integer> numbers = new ArrayList<>(Arrays.asList(9, 4, 1, 7,4,4,4,4));
////        int frequency = Collections.frequency(numbers, 4);
////        System.out.println(frequency);
//
//        Map<String, Integer> scores = new HashMap<>();
//        scores.put("Alice", 90);
//        scores.put("Bob", 85);
//        scores.put("Charlie", 95);
//
//        // Iterate over the entries in the map
//        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
//            String name = entry.getKey();
//            int score = entry.getValue();
//
//            System.out.println("Name: " + name + ", Score: " + score);
//        }
//
//
//    }
//
//}
//

import java.util.HashSet;
import java.util.Set;

    public class practice {
        public static int countUniqueSubstrings(String str, int k) {
            int n = str.length();
            Set<String> uniqueSubstrings = new HashSet<>();

            for (int i = 0; i <= n - k; i++) {
                String substring = str.substring(i, i + k);
                uniqueSubstrings.add(substring);
            }

            return uniqueSubstrings.size();
        }

        public static void main(String[] args) {
            String str = "ababc";
            int k = 3;

            int count = countUniqueSubstrings(str, k);
            System.out.println(count);
        }
    }






