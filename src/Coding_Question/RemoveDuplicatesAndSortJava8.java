package Coding_Question;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesAndSortJava8 {
    public static void main(String[] args) {
        // Create a List with duplicate elements
        List<Integer> numbers = Arrays.asList(5, 3, 8, 3, 2, 8, 1, 4);

        // Remove duplicates and sort the numbers using Java 8 Streams
        List<Integer> uniqueSortedNumbers = numbers.stream()         // Convert List to Stream
                .distinct()                                              // Remove duplicates
                .sorted()                                                // Sort the elements
                .collect(Collectors.toList());                            // Collect the result back into a List

        // Output the result
        System.out.println("Unique and sorted numbers: " + uniqueSortedNumbers);
    }
}
