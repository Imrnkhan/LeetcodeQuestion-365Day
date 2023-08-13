package GeekForGeek;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 555};
        System.out.println(test(arr));
    }
    public static int test(int[] arr){
        for (int i =0;i<arr.length;i++){
            String str = String.valueOf(arr[i]);
            if(!Palindrome(str)){
                return 0;
            }
        }

        return 1;
    }
    private static boolean Palindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while (start<end){
            if(str.charAt(start++)!=str.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}




/*
Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

Example 1:

Input:
5
111 222 333 444 555

Output:
1

Explanation:
A[0] = 111 //which is a palindrome number.
A[1] = 222 //which is a palindrome number.
A[2] = 333 //which is a palindrome number.
A[3] = 444 //which is a palindrome number.
A[4] = 555 //which is a palindrome number.
As all numbers are palindrome so This will return 1.
 */