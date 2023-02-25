package JavaImportant50Question;

public class SearchSortedArrayK {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(test(arr,target));
    }
    public  static int test(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid])
                return mid;
            else if (arr[mid] <= arr[right]) {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else
                    right = mid - 1;
            } else {
                if (target < arr[mid] && target >= arr[left]) {
                    right = mid - 1;
                } else
                    left = mid + 1;
            }
        }
        return -1;
    }
}
