package Coding_Question;

// Longest Substring Without Repeating Characters


import java.util.HashSet;
import java.util.Set;

public class longest_substring_nonRepeat {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(nonRepeat(str));
    }
    public static int nonRepeat(String str){
        int i =0, j =0, max = 0;

        Set<Character> hs = new HashSet<>();
        while (j<str.length()){
     if(!hs.contains(str.charAt(j))){
         hs.add(str.charAt(j++));
         max = Math.max(max,hs.size());
     }
     else {
         hs.remove(str.charAt(i++));
     }
        }
        return max;
    }
}
