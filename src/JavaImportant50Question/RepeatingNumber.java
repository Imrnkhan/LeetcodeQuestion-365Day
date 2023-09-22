package JavaImportant50Question;

import java.util.HashSet;

public class RepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 1}; // Example input array



        System.out.println(findRepeatingNumber(arr));
    }

    public static int findRepeatingNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                return num; // Found the repeating number
            }
        }

        return -1; // If no repeating number is found
    }
}
