package Coding_Question;

public class ConvertPalindrome {
    public static void main(String[] args) {
        String str = "aaaaakaaa";
        System.out.println(validPalindrome(str));
    }
    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }
}





// ham ko string ko palindrome bana hi us maise remove krki

/*
You are given a string of size n, you task is to convert it to a palindrome by performing the following move once

« In one move you can choose any character and delete all its occurences from the the string.

If you can form a palindrome by deleting all occurences of one character from it then output "YES" , else "NO"


3
5
abcba
9
aaaaakaaa
5
abcabc
 */