package JavaGudia_Question;

import java.util.Scanner;

public class Vovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input ");
        String str = sc.next();


        if (vovel(str))
            System.out.println("vovel is presnt");
        else
            System.out.println("consonent .. vowel not prenst");
    }


    public static boolean vovel(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                return true;
            }
        }
        return false;
    }
}