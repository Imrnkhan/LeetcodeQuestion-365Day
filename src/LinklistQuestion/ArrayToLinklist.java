package LinklistQuestion;

import java.util.LinkedList;

public class ArrayToLinklist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        test(arr);
    }
    public static void test(int[]arr){
        LinkedList<Integer> hs = new LinkedList<>();
        for(int i =0;i< arr.length;i++){
        hs.add(arr[i]);
        }
            System.out.println(hs);
    }
}
