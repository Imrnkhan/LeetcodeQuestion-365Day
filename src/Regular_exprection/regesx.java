package Regular_exprection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regesx {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[abc]");
        Matcher m = p.matcher("a7b@z#9ab\"");
        while (m.find()){
            System.out.println(m.start()+"---"+m.group());
        }
    }
}

// find the which index of the char in the index number