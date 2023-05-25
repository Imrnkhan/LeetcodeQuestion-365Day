package JavaGudia_Question;

public class MaximumFrequencyCount {
    public static void main(String[] args) {
        int [] arr = {1, 4, 4, 4, 5, 3};
        System.out.println(test(arr));
    }
    public static int test(int[] arr) {
        int[] frequency = new int[arr.length];

        // Count the frequency of each bird type
        for (int i =0;i<arr.length;i++) {
            frequency[arr[i]]++;
        }

        int maxFrequency = 0;
        int mostFrequentBird = 0;

        // Find the bird type with the maximum frequency
        for (int i = 1; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentBird = i;
            }
        }

        return mostFrequentBird;
    }
}

//every element count and print max element


//another solution
//if find minimum use
//        int minBirdType = Integer.MAX_VALUE;

/*
 public static int migratoryBirds(List<Integer> arr) {
        int countMax = 0;
        int value = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (list.contains(arr.get(i))) {
                continue;
            }
            list.add(arr.get(i));
            int count = 0;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
            if (count > countMax) {
                value = arr.get(i);
                countMax = count;
            } else if (countMax == count) {
                if (value > arr.get(i)) {
                    value = arr.get(i);
                }
            }
        }
        return value;
    }
 */