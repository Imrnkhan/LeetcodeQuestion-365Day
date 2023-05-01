package JavaImportant50Question;

    import java.util.*;

public class RepetinAndMissingNumber {

        public static void main(String[] args) {
            int[] arr = {3, 1, 2, 5, 3};
            Set<Integer> set = new HashSet<>();
            int repeating = -1;
            int missing = -1;

            for (int i = 0; i < arr.length; i++) {
                if (set.contains(arr[i])) {
                    repeating = arr[i];
                } else {
                    set.add(arr[i]);
                }
            }

            int expectedSum = arr.length * (arr.length + 1) / 2;
            int actualSum = 0;
            for (int i = 0; i < arr.length; i++) {
                actualSum += arr[i];
            }
            missing = expectedSum - actualSum + repeating;

            System.out.println("Repeating number: " + repeating);
            System.out.println("Missing number: " + missing);
        }
    }




    /*
    static ArrayList<Integer> find_missing_repeating(List<Integer> array) {
        int n = array.size() + 1;

        int[] substitute = new int[n]; // initializing the substitute array with 0 of size n+1.
        for (int i = 0; i < n; i++)
            substitute[i] = 0;

        ArrayList<Integer> ans = new ArrayList<>();              // initializing the answer  array .

        for (int i = 0; i < array.size(); i++) {
            substitute[array.get(i)]++;
        }

        for (int i = 1; i <= array.size(); i++) {
            if (substitute[i] == 0 || substitute[i] > 1) {
                ans.add(i);
            }
        }

        return ans;
    }
     */

