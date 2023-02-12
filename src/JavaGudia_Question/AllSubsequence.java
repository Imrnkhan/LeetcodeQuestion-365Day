package JavaGudia_Question;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        List<String> result = new ArrayList<>();
        generateSubsequences(s, result, 0, "");
        System.out.println(result);
    }

    private static void generateSubsequences(String s, List<String> result, int index, String current) {
        if (index == s.length()) {
            result.add(current);
            return;
        }
        generateSubsequences(s, result, index + 1, current);
        generateSubsequences(s, result, index + 1, current + s.charAt(index));
    }
}


/*

public class Main {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) != 0) {
                    sb.append(s.charAt(j));
                }
            }
            result.add(sb.toString());
        }
        System.out.println(result);
    }
}
This code generates all possible binary combinations of the string and creates a new string from the characters corresponding to the set bits in each binary combination. The result is a list of all possible subsequences of the input string, which is stored in the result list.





 */