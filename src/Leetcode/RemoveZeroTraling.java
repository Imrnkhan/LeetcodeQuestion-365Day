package Leetcode;

public class RemoveZeroTraling {
    public static void main(String[] args) {
        String str  = "51230100";
        System.out.println(test(str));

    }
    public static String test(String str ){
      int count =0;
      for(int i =str.length()-1;i>=0;i--){
          if(str.charAt(i)!='0'){
              break;

          }
          count++;
      }
      return str.substring(0,str.length()-count);
    }
}






/*
2710. Remove Trailing Zeros From a String
Easy
101
2
Companies
Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.



Example 1:

Input: num = "51230100"
Output: "512301"
Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".
Example 2:

Input: num = "123"
Output: "123"
Explanation: Integer "123" has no trailing zeros, we return integer "123".
 */