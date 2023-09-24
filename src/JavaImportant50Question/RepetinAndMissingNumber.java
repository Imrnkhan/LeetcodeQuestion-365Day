package JavaImportant50Question;

    import java.util.*;

public class RepetinAndMissingNumber {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 3};
        System.out.println(Arrays.toString(test(arr)));


    }
    public static int[] test(int[] arr){
        int[] result = new int[2];
 Map<Integer, Integer> countMap = new HashMap<>();

 for (int i =0;i<arr.length;i++) {
     countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
 }

 for (int i = 1; i <= arr.length; i++) {
     if (!countMap.containsKey(i)) {
         result[1] = i; // Missing number
     } else if (countMap.get(i) == 2) {
         result[0] = i; // Repeating number
     }
 }
 return result;
    }
}












//            Set<Integer> set = new HashSet<>();
//            int repeating = -1;
//            int missing = -1;
//
//            for (int i = 0; i < arr.length; i++) {
//                if (set.contains(arr[i])) {
//                    repeating = arr[i];
//                } else {
//                    set.add(arr[i]);
//                }
//            }
//
//            int expectedSum = arr.length * (arr.length + 1) / 2;
//            int actualSum = 0;
//            for (int i = 0; i < arr.length; i++) {
//                actualSum += arr[i];
//            }
//            missing = expectedSum - actualSum + repeating;
//
//            System.out.println("Repeating number: " + repeating);
//            System.out.println("Missing number: " + missing);
//        }
//    }




// // code here use hashmap TLE

// int[] result = new int[2];
// Map<Integer, Integer> countMap = new HashMap<>();

// for (int i =0;i<arr.length;i++) {
//     countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
// }

// for (int i = 1; i <= arr.length; i++) {
//     if (!countMap.containsKey(i)) {
//         result[1] = i; // Missing number
//     } else if (countMap.get(i) == 2) {
//         result[0] = i; // Repeating number
//     }
// }
// return result;



// // code here use hashset TLE


//  int[] result = new int[2];
// HashSet<Integer> seen = new HashSet<>();

// int repeating = 0;
// int expectedSum = (n * (n + 1)) / 2;
// int actualSum = 0;

// for (int i =0;i<arr.length;i++) {
//     if (seen.contains(arr[i])) {
//         repeating = arr[i];
//     }
//     seen.add(arr[i]);
//     actualSum += arr[i];
// }

// int missing = expectedSum - (actualSum - repeating);
// result[0] = repeating;
// result[1] = missing;

// return result;



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

