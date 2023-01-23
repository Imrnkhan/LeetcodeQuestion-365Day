package JavaGudia_Question;

public class Every_word_newLine {
    public static void main(String[] args) {
        String str = "The best programing language is java";

        String[] res = str.split("\\s");
        for(String ans:res){
            System.out.println(ans);
        }

    }
}
