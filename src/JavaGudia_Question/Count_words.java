package JavaGudia_Question;

public class Count_words {
    public static void main(String[] args) {
        String str = "In the given string";
        test(str);
    }
    public static void  test(String str){
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {

//                if ((str.charAt(i) == ' ')){   //is also work
                count++;
            }
        }
        System.out.println(count);
    }
}

//count string single sentance

//
//    int count = 0;
//  for (String word : str.split(" ")) {
//          count++;
//      print(count)