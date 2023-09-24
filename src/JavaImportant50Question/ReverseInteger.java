package JavaImportant50Question;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(test(num));
    }
    public static int test(int num) {
        long ans=0;
        while(num!=0){
            int demo = num%10;
            ans = ans*10+demo;
            num = num/10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
            return 0;
        }
        return (int)ans;

    }
}



/*
another way 1

    public int reverseInteger(int num) {
    String reversedString = new StringBuilder(String.valueOf(num)).reverse().toString();
    return Integer.parseInt(reversedString);
}





public int reverseInteger(int num) {
    int reversedNum = 0;

    while (num != 0) {
        int digit = num % 10;
        reversedNum = reversedNum * 10 + digit;
        num = num / 10;
    }

    return reversedNum;
}

 */