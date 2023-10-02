package JavaImportant50Question;

import java.util.Arrays;

public class SortArrayOddEven {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3};
        System.out.println(Arrays.toString(test(arr)));
    }
    public static int[] test(int[]arr){
        int ans = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){              // if use ==0 than even if use 1 odd
                int temp = arr[ans];
                arr[ans] = arr[i];
                arr[i] = temp;
                ans++;
            }
        }
        return arr;
    }
}
