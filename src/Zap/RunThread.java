package Zap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunThread {
    public static void main(String[] args) {
    String s1 = new String("Welcome");
    String s2 = new String("Welcome");
        System.out.println(s1.compareTo(s2));

//if(s1==s2)
if(s1.equals(s2))
            System.out.println("same");
else
        System.out.println("not same");
    }

}