package JavaImportant50Question;



import java.util.HashMap;
import java.util.Map;

public class FindDuplicateHashmapSol {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 2, 6, 8, 9, 4, 9};

        test(arr);
    }

    public static void test(int[]arr) {
        Map<Integer, Integer> map = new HashMap<>();

        // loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // check if the element is already in the map
            if (map.containsKey(arr[i])) {
                // increment the count of the element
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                // add the element to the map with count 1
                map.put(arr[i], 1);
            }
        }

        // loop through the map to print duplicate elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}

