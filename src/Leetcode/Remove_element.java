package Leetcode;

public class Remove_element {
    public static void main(String[] args) {
        int [] arr = {0,1,2,2,3,0,4,2};
        int target = 2;

        System.out.println(removeElement(arr,target));
    }
        public static int removeElement(int[] arr, int target) {
            int ans =0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=target){
                    arr[ans] = arr[i];
                    ans++;
                }
            }
            return ans;               //find the left element length
        }
    }

//{0,1,2,2,3,0,4,2}
// ans = 2
//after tha left - 0,1,3,0,4