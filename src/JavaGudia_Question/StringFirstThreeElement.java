package JavaGudia_Question;

public class StringFirstThreeElement {
    public static void main(String[] args) {
        String str = "Java is good language";
        test(str);
    }
    public static void  test(String str){
        String ans = str.substring(0,3);    // another take 0,length=3
        System.out.println(ans);
    }
}



/*
public class Main {
  public static void main(String[] args) {
    String word = "Hello World";
    int length = 3;

    String firstThree = word.substring(0, length);

    System.out.println(firstThree);
  }
}

 */