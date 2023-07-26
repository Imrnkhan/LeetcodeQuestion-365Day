package Coding_Question;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequency {
    public static Map<Integer, Integer> findFrequencyBruteForce(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            int count = 0;
            for (int element : arr) {
                if (num == element) {
                    count++;
                }
            }
            frequencyMap.put(num, count);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4, 1, 4, 5};
        Map<Integer, Integer> frequencyMap = findFrequencyBruteForce(arr);

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}



//optimal aproch



/*

public class FrequencyCounter {
    public static Map<Integer, Integer> findFrequencyOptimal(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4, 1, 4, 5};
        Map<Integer, Integer> frequencyMap = findFrequencyOptimal(arr);

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}


 */