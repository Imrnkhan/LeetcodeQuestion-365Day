package Zap;


public class Practice {
    public static void main(String[] args) {
 int [] arr = {-1,-3,-4,2,4,5};
        System.out.println(test(arr));
    }
    public static int test(int[] arr){
        int pos = 0;
        int neg = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                pos++;
            } else if (arr[i]<0) {
                neg--;

            }
        }
            return Math.max(pos,neg);
    }
    }





