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
