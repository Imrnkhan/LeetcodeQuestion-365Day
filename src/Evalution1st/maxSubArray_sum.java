package Evalution1st;

public class maxSubArray_sum {

    public int maxSub(int [] nums){



        int temp = nums[0];   /// initialise the varible on 0th index
        int max = nums[0];

        for(int i =1;i< nums.length;i++){
            if(temp<0){
                temp = nums[i];

            }
            else {
                temp = temp+ nums[i];

            }
            max = Math.max(temp,max);
        }
        return max;
    }
}
