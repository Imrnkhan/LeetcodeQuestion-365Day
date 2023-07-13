package GeekForGeek;

import java.util.ArrayList;
import java.util.Collections;

public class LadderAnArrays {
    public static void main(String[] args) {
        int[]arr = {16,17,4,3,5,2};
        int n = 6;
        System.out.println(test(arr,n));
    }
   public static ArrayList<Integer> test(int arr[], int n){

        int maxTillNow = Integer.MIN_VALUE;
        ArrayList<Integer> answer = new ArrayList<>();

        //traversing from back and appending the maxtillnow's in the answer
        for(int i = n-1 ; i>= 0 ; i--){             // n-1 = 5
            if(arr[i]>=maxTillNow){                // arr[5] = 2   and  2>=-2567383   because use max_min
                maxTillNow = arr[i];                // -2567383 = 2  add this no.1st no is 2 again same process
                answer.add(arr[i]);                   //2nd time max no- 2,,, and 3rd time max = 5 and comprae all one by one
                                               //and max no = 17 and compare same way now print = 2 5 17 now reverse = 17 5 2
            }
        }
        //reversing the arrayList
        Collections.reverse(answer);

        return answer;
    }
}


// n


/*
Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.



Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17
as it is greater than all the elements
to its right.  Similarly, the next
leader is 5. The right most element
is always a leader so it is also
included.
 */