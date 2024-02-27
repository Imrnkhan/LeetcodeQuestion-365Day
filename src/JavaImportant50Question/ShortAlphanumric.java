package JavaImportant50Question;

import java.util.Arrays;

public class ShortAlphanumric {
    public static void main(String[] args) {
        String[]arr = {"abc123", "bh34"};
        Arrays.sort(arr, (s1, s2) -> removeNonAlphanumeric(s1).compareTo(removeNonAlphanumeric(s2)));
        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));

        // Sorting in descending order
        Arrays.sort(arr, (s1, s2) -> removeNonAlphanumeric(s2).compareTo(removeNonAlphanumeric(s1)));
        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));
    }

    private static String removeNonAlphanumeric(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "");

    }
}
