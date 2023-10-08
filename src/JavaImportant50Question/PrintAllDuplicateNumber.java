package JavaImportant50Question;

import java.util.HashSet;

public class PrintAllDuplicateNumber {

        public static void main(String[] args) {
            int[] nums = {52,14,65,1,2,3,5,6,2,3,6,4,8,8};

            System.out.println(test(nums));
        }

        public static HashSet<Integer> test(int[] nums) {
            HashSet<Integer> hs = new HashSet<>();
            HashSet<Integer> duplicates = new HashSet<>();
            for (int i =0;i< nums.length;i++) {
                if (hs.contains(nums[i])) {
                    duplicates.add(nums[i]);
                } else {
                    hs.add(nums[i]);
                }
            }
            return duplicates;
        }
    }


    //all dupliacte
