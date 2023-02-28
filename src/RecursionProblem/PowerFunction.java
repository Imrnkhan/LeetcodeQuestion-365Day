package RecursionProblem;

public class PowerFunction {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println(test(a,b));
    }
    public static int test(int a,int b){
        if(b==0)
            return 1;

        else if (b==1)
            return a;
        else
            return a*test(a,b-1);


        }
    }

/*

a = 2
b = 4
2^4 = 16
exp = 2*2*2*2 = 16



2nd exp
a =3
b =5

3*3*3*3*3= 243
3^5 = 3 * 3 * 3 * 3 * 3 = 243.
 */