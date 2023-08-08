package Leetcode;

import java.util.Map;
import java.util.TreeMap;

public class Frequency_Min_Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 5};
//        System.out.println(test(arr));
        Map<Integer, Integer> frequency = test(arr);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int value : frequency.values()) {
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
           System.out.println(max); // print max value
           System.out.println(min); // print min value

    }


    public static Map<Integer, Integer> test(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Map<Integer, Integer> frequency = new TreeMap<>();
        for(int i =0;i<arr.length;i++){
            if (frequency.containsKey(arr[i])) {
                frequency.put(arr[i], frequency.get(arr[i]) + 1);
            } else {
                frequency.put(arr[i], 1);
            }
        }
        return frequency;
    }
}





//public class frequency {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 3, 3, 3, 5};
//
//        // Create a HashMap to store the frequency of each element
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//
//        // Loop through the array and increase the frequency of each element
//        for (int i : arr) {
//            if (frequencyMap.containsKey(i)) {
//                frequencyMap.put(i, frequencyMap.get(i) + 1);
//            } else {
//                frequencyMap.put(i, 1);
//            }
//        }
//
//        // Loop through the frequency map and print the element and its frequency
//        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
//        }
//    }
//}
