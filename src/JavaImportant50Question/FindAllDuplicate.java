package JavaImportant50Question;

import java.util.HashSet;
import java.util.Set;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(test(arr));
    }
    public static Set<Integer> test(int[] arr){
        Set<Integer> hs = new HashSet<>();
        Set<Integer> hd = new HashSet<>();
        for(int i= 0;i< arr.length;i++){
            if(!hs.add(arr[i])){
                hd.add(arr[i]);
            }
        }

        return hd;
    }
}




//use set two times and filter
// tiime compl = O(n)
//space = O(1)

//print  only duplicate value in arr given

//
//    public static ArrayList<Integer> duplicates(int arr[], int N) {
//        HashSet<Integer> set = new HashSet<>();
//        HashSet<Integer> duplicatesSet = new HashSet<>();
//
//        for (int i = 0; i < N; i++) {
//
//            if (!set.add(arr[i])) {
//                duplicatesSet.add(arr[i]);
//            }
//        }
//
//        List<Integer> result = new ArrayList<>(duplicatesSet);
//
//        if (result.isEmpty()) {
//            result.add(-1);
//        }
//
//        Collections.sort(result); // Sort the result in ascending order
//
//        return new ArrayList<>(result);
//    }


//if not fount return -1