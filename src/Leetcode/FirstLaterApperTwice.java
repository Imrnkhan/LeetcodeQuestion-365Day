package Leetcode;

import java.util.HashSet;

public class FirstLaterApperTwice {
    public static void main(String[] args) {
        String str = "abccbaacz";
        System.out.println(test(str));
    }
    public static char test(String str){
        HashSet<Character> hs = new HashSet<>();
        for(int i =0;i<str.length();i++){
            if(hs.contains(str.charAt(i))){
                return str.charAt(i);
            }
            else {
                hs.add(str.charAt(i));
            }
        }
        return '0';
    }
}


//first charcter in twice in ek sath aaye