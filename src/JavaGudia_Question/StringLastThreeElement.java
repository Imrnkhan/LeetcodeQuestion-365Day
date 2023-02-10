package JavaGudia_Question;

public class StringLastThreeElement {
    public static void main(String[] args) {
        String str = "Hello world";
        test(str);
    }
    public static void test (String str){
        String ans = str.substring(8,11);   //another str.length()-3
        System.out.println(ans);
    }
}


/*
public class Main {
  public static void main(String[] args) {
    String word = "Hello World";
    int length = word.length();
    int startIndex = length - 3;

    String lastThree = word.substring(startIndex);

    System.out.println(lastThree);
  }
}

 */