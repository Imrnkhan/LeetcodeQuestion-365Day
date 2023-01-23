package JavaGudia_Question;

public class PrintSubArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        sunArray(arr);
    }


    //Time Complexity: O(n^2)
    public static void  sunArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                for(int k =i;k<=j;k++){

                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}


// 1 1 2 1 2 3 2 2 3 3
//subarrays are used in the context of arrays and substring in the context of strings

//If array is {1,2,3}
//    then you need to print
//{1}, {2}, {3}, {1,2}, {2,3}, {1,2,3}

/*
1
1 2
1 2 3
2
2 3
3
 */