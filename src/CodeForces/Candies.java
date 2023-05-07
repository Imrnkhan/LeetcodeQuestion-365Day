package CodeForces;

public class Candies {
    public static void main(String[] args) {
        int[] arr= {4, 5 ,9 ,10, 2};
        int A = 1;
        int B = 3;
        test(arr,A,B);
    }
    public static void test(int[] arr,int A,int B){
        int sum =0;
        for(int i = A;i<=B;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}

// Question motive start the index A= 1; and end index B = 3 and sum elemnt

/*
There are N
 kids sitting on the floor in the row. We give each kid a number from 0
 to N−1
 from left to right. The kid that was given number i
 holds Ci
 candies (for 0≤i<N
). How many candies have all the kids between positions A
 and B
 (inclusively)?

Input
The first line contains an integer N
 (1≤N≤1000000)
 – the number of kids. The second line contains N
 integers C0,C1,…,CN−1
 (1≤Ci≤1000
) – i
-th of them means that the kid with the number i
 holds Ci
 candies. The third and the last line contains two integers A
 and B
 (0≤A≤B<N
) – the borders of the interval in our query.

Output
Output a single number – the sum of candies being hold from children between positions A
 and B
 (inclusively), i.e. CA+CA+1+…+CB
.

Examples
inputCopy
5
4 5 9 10 2
1 3
outputCopy
24
 */