package ArrayList_Problem;

import java.util.Arrays;
    import java.util.ArrayList;
public class SortedTwoArray_merge {


        public static void main(String[] args) {
            Integer[] arr1 = {1, 3, 5, 7, 9};
            Integer[] arr2 = {2, 4, 6, 8, 10};
            ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
            ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
            list1.addAll(list2);
            Integer[] mergedArr = list1.toArray(new Integer[list1.size()]);  // ya use new integer[0]
            System.out.println(Arrays.toString(mergedArr));
        }
    }

//time O(n)
//space O(n)
