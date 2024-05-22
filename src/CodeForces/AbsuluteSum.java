package CodeForces;

public class  AbsuluteSum {
    public static void main(String[] args) {
        int []arr = {-1,2,-3};
        System.out.println(test(arr));
    }
    public static int test(int[]arr){
        int sum =0;
        for(int i =0;i< arr.length;i++){
            sum+=arr[i];
        }
        return Math.abs(sum);
    }

}


/*
4
7 2 1 3
outputCopy
13
inputCopy
3
-1 2 -3
outputCopy
2
 */