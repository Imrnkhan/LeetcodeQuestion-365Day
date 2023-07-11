package GeekForGeek;

import java.util.ArrayList;

public class SubarrayGivenSum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 7, 5};
        int k = 12;

        System.out.println(test(arr,n,k));



    }

    public static ArrayList<Integer> test(int[] arr, int n, int s) {
        ArrayList<Integer> subarrayIndices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == s) {
                    subarrayIndices.add(i + 1);
                    subarrayIndices.add(j + 1);
                    return subarrayIndices;
                }

//                if (sum > s) {
//                    break;
//                }
            }
        }

//        subarrayIndices.add(-1);
        return subarrayIndices;
    }
}




/*
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements
from 2nd position to 4th position
is 12.

 If no such subarray is found, return an array consisting of only one element that is -1.
 */