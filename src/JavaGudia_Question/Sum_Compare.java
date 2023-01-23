package JavaGudia_Question;

public class Sum_Compare {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5};
        test(arr);

    }
    public static void  test(int[] arr){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];

        }
        int avg = sum/arr.length;
        System.out.println(avg+1);
    }
}

/*
1+2+3+4+5 =15
3+3+3+3+3=15
4+4+4+4+4 =20
20>15
 */