package JavaGudia_Question;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int []nums ={2,3,-2,4};
        System.out.println(test(nums));
    }
    public static int test(int[]nums){
    int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
        int product = 1;

        for (int j = i; j < nums.length; j++) {
            product *= nums[j];
            maxProduct = Math.max(maxProduct, product);
        }
    }

        return maxProduct;
}
}


//all subarray
//        2
//        2 3
//        2 3 -2
//        2 3 -2 4
//        3
//        3 -2
//        3 -2 4
//        -2
//        -2 4
//        4