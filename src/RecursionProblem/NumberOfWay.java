package RecursionProblem;

public class NumberOfWay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(test(n));
    }
    public static int test(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return test(n-1)+test(n-2)+test(n-3);
    }
}

/*
N = 4
1 1 1 1
1 1 2
2 1 1
1 2 1
2 2
1 3
3 1

Output = 7

Suppose when N = 3
1 1 1
1 2
2 1
3

Suppose when N = 2
1 1
2

Suppose when N = 1
1
 */