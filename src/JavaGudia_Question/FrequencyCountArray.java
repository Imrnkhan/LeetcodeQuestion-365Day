package JavaGudia_Question;

    import java.util.*;
public class FrequencyCountArray {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 2, 3, 1, 2, 4, 4, 5};

            // Count frequency of each element
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int i=0;i< arr.length;i++) {
                frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
            }

            System.out.println(frequencyMap);

            // Display the frequencies
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }


