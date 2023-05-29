package Collection_Map_Day12;

import java.util.HashMap;
import java.util.Map;

public class MapEntryway {
    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        // Iterate over the entries in the map
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();

            System.out.println("Name: " + name + ", Score: " + score);
        }
    }
}

