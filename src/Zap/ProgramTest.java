package Zap;

import java.util.*;

public class ProgramTest {
    public static void main(String[] args) {
        List<Integer> idList = Arrays.asList(1, 2, 3, 4, 3, 4);
        List<String> nameList = Arrays.asList("ram", "aman", "riku", "pawan", "raju", "kapil");

        Map<Integer, String> idNameMap = new HashMap<>();
        Set<Integer> duplicateIds = new HashSet<>();
        Set<String> uniqueNames = new HashSet<>();

        for (int i = 0; i < idList.size(); i++) {
            int id = idList.get(i);
            String name = nameList.get(i);

            if (idNameMap.containsKey(id)) {
                duplicateIds.add(id);
            } else {
                idNameMap.put(id, name);
                uniqueNames.add(name);
            }
        }

        // Remove names associated with duplicate IDs
        for (int id : duplicateIds) {
            uniqueNames.remove(idNameMap.get(id));
        }

        // Print unique names
        System.out.println("Unique names: " + uniqueNames);
    }
}
