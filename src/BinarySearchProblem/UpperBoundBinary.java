package BinarySearchProblem;

public class UpperBoundBinary {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        int target = 4;
        System.out.println(upperBound(arr,target));
    }
    public static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (target >= arr[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

}


//upper bound will return the index which exectly greather than the target element