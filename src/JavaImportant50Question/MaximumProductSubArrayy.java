package JavaImportant50Question;

public class MaximumProductSubArrayy {
    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};
        System.out.println(test(arr));
    }
    public static int test(int[]arr){
        int maxproduct = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            int product =1;
            for(int j = i;j< arr.length;j++){
                product*=arr[j];

                maxproduct = Math.max(product,maxproduct);
            }
        }
        return maxproduct;
    }
}
