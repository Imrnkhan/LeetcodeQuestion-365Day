package Coding_Question;

public class Missing_integer {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        missing(arr);
    }
    public static void missing(int[]arr){
        int sum = 0;
        int total = 0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
            total+=i+1;
        }
        System.out.println(total-sum);
    }
}
