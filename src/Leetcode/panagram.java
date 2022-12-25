package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class panagram {

    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkpanagram(str));

    }
    public static boolean checkpanagram(String str){
        Set<Character> hs = new HashSet<>();
        for(int i =0;i<str.length();i++){
            hs.add(str.charAt(i));

        }
        if(hs.size()==26){
            return true;
        }
        return false;
    }
}
