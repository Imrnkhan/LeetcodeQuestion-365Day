package JavaImportant50Question;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(test(num));
    }
    public static boolean test(int num){
        if(num==0){
            return false;
        }
        while (num%2==0){
            num = num/2;
        }
        if(num==1){
            return true;
        }
        return false;
    }
}

//1. if the num is equal =0 and false
//2. if the number if divisible is 2 and reminder is 0 than and num again divide 2
//3. again if num ==1 than true else false