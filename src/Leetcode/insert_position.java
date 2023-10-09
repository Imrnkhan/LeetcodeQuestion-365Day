package Leetcode;

public class insert_position {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int tagget = 9;
        System.out.println(searchInsert(arr, tagget));

    }

    public static int searchInsert(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}


//  yeh number kis position per hi