package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountEachNumberFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,41,2,3,5,6};
        System.out.println(countEach(arr));
    }
    public static Map<Integer, Integer> countEach(int[] arr) {
        // Create a HashMap to store the frequency of each element

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the occurrences of each element in the array
            for(int i =0;i<arr.length;i++){
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        return frequencyMap;
    }
}



//Another way
/*


 */