package Coding_Question;

import java.util.HashSet;
import java.util.Set;

public class SmallestMissingNumber {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 7, 100, 12, 22, 12, 22};
        int[] arr2 = {12, 3, 6, 100, 40, 3, 50, 7};
        test(arr1,arr2);
    }
    public static void test(int[]arr1,int[]arr2){
        Set<Integer> hs = new HashSet<>();
        for(int i =0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        int smallest = Integer.MAX_VALUE;
        for(int j =0;j<arr1.length;j++){
            if(!hs.contains(arr1[j])){
                smallest = Math.min(smallest,arr1[j]);

            }
        }
        if(smallest==Integer.MAX_VALUE){
            System.out.println("-1");
        }
        else {
            System.out.println("smallest Element: " +" "+ smallest);
        }
    }
}
