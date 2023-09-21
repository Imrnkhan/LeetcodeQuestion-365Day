package Coding_Question;
import java.util.HashSet;
import java.util.ArrayList;


// arraylist to print array
public class RemoveDuplicateUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 2};

        int[] result = removeDuplicates(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");

        }
    }

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.add(arr[i])) {
                resultList.add(arr[i]);
            }
        }

        // Convert ArrayList to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}


//array to arraylist
/*
import java.util.LinkedHashSet;
        import java.util.ArrayList;

public class RemoveDuplicateUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 2};
        System.out.println(test(arr));
    }

    public static ArrayList<Integer> test(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
            if (set.add(arr[i]))
                result.add(arr[i]);

        return result;
    }
}


 */