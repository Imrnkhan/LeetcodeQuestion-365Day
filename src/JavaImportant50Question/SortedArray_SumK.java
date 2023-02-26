package JavaImportant50Question;

import java.util.Arrays;

public class SortedArray_SumK {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int k = 9;
        System.out.println(Arrays.toString(test(arr, k)));
    }
    public static int[] test(int[] arr,int k){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};

    }
}

/*
   public static int[] findPair(int[] arr, int k) {
    int left = 0;
    int right = arr.length - 1;
    int[] result = new int[2];

    while (left < right) {
        int currentSum = arr[left] + arr[right];

        if (currentSum == k) {
            result[0] = arr[left];
            result[1] = arr[right];
            return result;
        } else if (currentSum < k) {
            left++;
        } else {
            right--;
        }
    }

    return result;
}

 */

//    This method takes in an integer array arr and an integer K as parameters, and returns an integer array of length 2 containing the two numbers whose sum is K, or an empty array if no such pair is found.
//
//        The method uses a while loop to iterate over the array, with two pointers left and right pointing to the first and last elements of the array, respectively. The loop continues until left is greater than or equal to right. Within the loop, we calculate the sum of the elements at the two pointers, and compare it with K. If the sum is equal to K, we return an array containing the two numbers. If the sum is greater than K, we decrement the right pointer, else we increment the left pointer.
//
//        I hope that helps! Let me know if you have any further questions.




