package Coding_Question;

import java.util.HashMap;

public class FirstNonRepeatingCharacterUsingMap {
    public static void main(String[] args) {
        String str = "swiss";
        test(str);

    }
    public static void test(String str){
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i =0;i<str.length();i++){
            hs.put(str.charAt(i), hs.getOrDefault(str.charAt(i),0)+1);

                }

            for(int j =0;j<str.length();j++){
                if(hs.get(str.charAt(j))==1){
                    System.out.println(str.charAt(j));
                    return;
            }

            }
        }
    }

/*
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String input = "swiss";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Check if the character appears only once
            if (input.indexOf(c) == input.lastIndexOf(c)) {
                System.out.println(c);
                return;
            }
        }
    }
}

 */