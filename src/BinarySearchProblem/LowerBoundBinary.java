package BinarySearchProblem;

public class LowerBoundBinary {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        int target = 4;
        System.out.println(lowerBound(arr,target));
    }
    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

}


//lower bound return index which is either equal to the target element or greather than
//like  4 se chota element ya equal ans =4th number and element no of index =3;
