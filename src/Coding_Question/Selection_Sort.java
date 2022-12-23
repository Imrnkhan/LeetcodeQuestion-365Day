package Coding_Question;

public class Selection_Sort {
    public static void Sorting(int []arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {5,4,6,9,8,7,1};

        for(int i =0;i<arr.length;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;

                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i]  = temp;


                }

            }
        }
        Sorting(arr);

    }
}
