package JavaImportant50Question;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7};
        int k =3;
        System.out.println(test(arr,k));
    }
    public static boolean test(int[] arr,int k){
        int start =0;
        int end = arr.length-1;
        while (start<end){
            int mid = (start+end)/2;

            if(arr[mid]==k){
                return true ;
            } else if (arr[mid]<k) {
                end = mid-1;

            }
            else {
                start = mid+1;
            }
        }
        return false;
    }
}


//T = O(logN)
//s = O(1)


//another way same T and S

/*
public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 3;
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println("Key " + key + " exists in the array");
        } else {
            System.out.println("Key " + key + " does not exist in the array");
        }
    }
}


 */