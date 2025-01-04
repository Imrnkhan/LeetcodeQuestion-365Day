package ArrayList_Problem;

import java.util.*;

public class KeyValueSorting {

    public static void main(String[] args) {
        // Create a HashMap with 10 records
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 45);
        map.put("Alice", 30);
        map.put("Bob", 35);
        map.put("Daisy", 25);
        map.put("Mike", 50);
        map.put("Carol", 40);
        map.put("Steve", 20);
        map.put("Rachel", 55);
        map.put("Tom", 60);
        map.put("Eve", 70);

        // Sort by keys
        Map<String, Integer> sortedByKeys = new TreeMap<>(map);
        System.out.println("Sorted by Keys:");
        sortedByKeys.forEach((key, value) -> System.out.println(key + ": " + value));


        // Sort by values
        Map<String, Integer> sortedByValues = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        LinkedHashMap::new,
                        (m, e) -> m.put(e.getKey(), e.getValue()),
                        LinkedHashMap::putAll
                );

        System.out.println("\nSorted by Values:");
        sortedByValues.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}
