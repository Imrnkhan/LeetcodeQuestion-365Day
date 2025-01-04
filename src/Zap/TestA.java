package Zap;


public class TestA {
 public static void main(String[] args) {
  int [] nums = {3,2,2,3};
  int val = 3;
  System.out.println(test(nums,val));

 }
 public static int test(int[] nums, int val) {
//  HashSet<Integer> hs = new HashSet<>();
//  int count = 0;
//  for (int i =0;i<nums.length;i++) {
//   if (hs.add(nums[i])) {
//    nums[count] = nums[i];
//    count++;
//   }
//  }
////  return hs.size();
//  return hs;
// }
//}
   int left =0;
       int right = nums.length-1;
       while(left<=right){
           if(nums[left]==val){
               nums[left]=nums[right];
                   right--;
           }
           else{
               left++;
           }
       }
   return left;

   }
         }
