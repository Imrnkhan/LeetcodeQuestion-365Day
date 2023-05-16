package Leetcode;

public class AramStrongNumber {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(test(num));
    }
    public  static boolean test(int num){
        int sum = 0;
        int temp =num;
        int ans = Integer.toString(num).length();
        while (temp>0){
            sum+=power(temp%10,ans);
            temp = temp/10;
        }
        if(sum==num){
            return true;
        }
        else {
            return false;
        }
    }
    private static int power(int a,int b){
        int res = 1;
        for(int i =0;i<b;i++){
            res= res*a;
        }

        return res;
    }
}
