package CodeForces;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr = {1,4,5,6,7};
        test(arr);
    }
    public static void test(int[]arr){
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
