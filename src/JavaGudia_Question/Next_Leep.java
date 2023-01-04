package JavaGudia_Question;

public class Next_Leep {
    public static void main(String[] args) {
        int year = 2020;
        int n = 15;
        int count =0;

        while(count !=n){

            year = year+1;

            if ((year % 400 == 0)|| (year % 4 == 0 && year % 100 != 0)){
                //this condition same work like year divisible in 4
                count++;
//                System.out.println(count);
                System.out.println(year);

            }
        }
    }
}


// 1. point every time add year+1
// 2. than goes to when count = n ho jye 