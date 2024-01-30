package Zap;

public class Remove_Duplicate11_leetcode80Ques {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3};
        System.out.println(test(arr));
    }
    public static int test(int[] arr){
        int count = 2;
        for(int i =2;i<arr.length;i++){
            if(arr[i]!=arr[count-2]){
                arr[count++] = arr[i];
            }
        }
        return count;
    }
}

// ham ko twise time lena hi ek value or single ko single or count krna hi

// start index = 2
//arr=   1,1,1,2,2,3
//index= 2,3,4,5,6,7 