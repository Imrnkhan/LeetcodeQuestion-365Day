package JavaImportant50Question;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

        public static int findMostFrequent(int[] nums) {


            Map<Integer, Integer> frequencyMap = new HashMap<>();

            for (int i =0;i< nums.length;i++) {
                frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
            }

            int mostFrequentElement = Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();
                                          // when requried max use max if need min use min
            return mostFrequentElement;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 2, 3, 2, 1, 4, 2, 5, 2};

            System.out.println("The most frequent element is: " + findMostFrequent(nums));
        }
    }


//1-2 times
//2-3
//3-1
//4-1
//5-1



//another optimal way



//    Map<Integer, Integer> frequencyMap = new HashMap<>();
//    int maxCount = 0;
//    int mostFrequentElement = nums[0];
//
//        for (int num : nums) {
//                int count = frequencyMap.getOrDefault(num, 0) + 1;
//                frequencyMap.put(num, count);
//
//                if (count > maxCount) {
//                maxCount = count;
//                mostFrequentElement = num;
//                }
//                }
//
//                return mostFrequentElement;