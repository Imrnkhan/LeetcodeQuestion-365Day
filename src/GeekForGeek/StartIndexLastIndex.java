package GeekForGeek;

import java.util.Arrays;

public class StartIndexLastIndex {
    public static void main(String[] args) {
        int[] arr =  { 1, 2, 3, 4, 5, 5 };
        int target = 5;
        System.out.println(Arrays.toString(test(arr, target)));
    }
    public static int[] test(int[]arr,int target){
        int startindex = -1;
        int endindex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                if(startindex== -1){
                    startindex =i;
                }
                endindex =i;
            }
        }
        return new int[]{startindex,endindex};
    }
}
