package Leetcode;

public class SearchPositionK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int k = 5;
        System.out.println(binarySearch(arr,k));

    }
    public static int binarySearch(int[] arr, int k) {
        int low = 0;

        int high = arr.length - 1;

        while (low <=high) {
            int mid = (low + high) / 2;      //1st+last/2
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // If the element is not found, return -1.
    }


}

