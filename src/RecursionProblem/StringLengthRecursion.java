package RecursionProblem;

public class StringLengthRecursion {
    public static void main(String[] args) {
        String str = "masaischool";

        System.out.println(test(str));
    }

    public static int test(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return 1 + test(str.substring(1));
        }
    }
}



/*

exp  str = masaischool

bacis i can print  System.out.println(str.length)
but this side print rec.

 */