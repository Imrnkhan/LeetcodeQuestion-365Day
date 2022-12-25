package Leetcode;

public class Remove_element {
    public static void main(String[] args) {
        int [] arr = {0,1,2,2,3,0,4,2};
        int ans = 2;

        System.out.println(removeElement(arr,ans));
    }
        public static int removeElement(int[] arr, int ans) {
            int j=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=ans){
                    arr[j] = arr[i];
                    j++;
                }
            }
            return j;
        }
    }

//{0,1,2,2,3,0,4,2}
//after tha left - 0,1,3,0,4