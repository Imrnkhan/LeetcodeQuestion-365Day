package Coding_Question;

public class Add_digit {
    public static void main(String[] args) {
        int arr = 38;
        System.out.println(Add(arr));
    }
    public static int Add(int arr){
        int ans = (arr-1)%9;
        return 1+ans;
    }

}



//38-1%9 = reminder 1
//1+1 = 2
// other way return 1+(arr-1)%9
//38 = 3+8 => 11
// 11 = 1+1 => 2 Optput