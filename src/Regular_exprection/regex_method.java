package Regular_exprection;


//Boolean mateches


import java.sql.Struct;
import java.util.regex.Pattern;

public class regex_method {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[abc]","a"));
    }
}



//replace all
//in case you want only one chareter and  written one char if need [0-4] written this way



class mains{
    public static void main(String[] args) {
        String s1 = "485124578";
        String s2 = s1.replaceAll("[0-4]","8");
        System.out.println(s2);
    }
}

class maing{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\s");
        String[] s = p.split("Hello how are you");
//        for(String s1:s) {
        for(int i =0;i< s.length;i++){

            System.out.println(s[i]);
            }

        }

    }


class main{
    public static void main(String[] args) {
        String str = "hello how are you";
        String[] s = str.split("\\s");
        for(int i =0;i< s.length;i++){
            System.out.println(s[i]);
        }
    }
}