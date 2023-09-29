package CodeForces;

public class LessElementRemove {
    public static void main(String[] args) {
        int[] arr = {5,3,2,7,6,9};
        System.out.println(test(arr));
    }
    public static int test(int[] arr){
        int count =0;
        for(int i =1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                count++;
//                arr[i] = arr[i-1];
            }
        }
        return count;
    }
}


//exp =         int[] arr = {5,3,2,7,6,9};
// 5 se chota elemnt 3,2 count and again next 7se chota emelnt 6 and all count = 3