package Coding_Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_IntegerArrayForm {
    public static void main(String[] args) {
        int [] num = {1,2,0,0};
        int k = 34;

        System.out.println(AddArray(num,k));
    }
    public static List<Integer> AddArray(int[] num, int k){
        ArrayList<Integer> hs = new ArrayList<>();
        for(int i = num.length-1;i>=0;i--){
            hs.add((num[i]+k)%10);
             k = (num[i]+k)/10;

        }
        while (k>0){
            hs.add(k%10);
            k = k/10;
        }
        Collections.reverse(hs);
        return hs;
    }
}




// Question
//    The array-form of an integer num is an array representing its digits in left to right order.
//
//        For example, for num = 1321, the array form is [1,3,2,1].
//        Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
//
//
//
//        Example 1:
//
//        Input: num = [1,2,0,0], k = 34
//        Output: [1,2,3,4]
//        Explanation: 1200 + 34 = 1234
//        Example 2:
//
//        Input: num = [2,7,4], k = 181
//        Output: [4,5,5]
//        Explanation: 274 + 181 = 455
//        Example 3:
//
//        Input: num = [2,1,5], k = 806
//        Output: [1,0,2,1]
//        Explanation: 215 + 806 = 1021