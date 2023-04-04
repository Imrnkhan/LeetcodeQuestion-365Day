package JavaGudia_Question;

public class reverse_String {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(test(str));
    }
    public static StringBuilder test(String str){

        StringBuilder hs = new StringBuilder();
        for(int i =str.length()-1;i>=0;i--){
            hs.append(str.charAt(i));
        }
        return hs;
    }
}


/*
344. Reverse String
Easy
7.1K
1.1K
Companies
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */