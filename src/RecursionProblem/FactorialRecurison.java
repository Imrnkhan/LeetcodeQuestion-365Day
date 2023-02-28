package RecursionProblem;

public class FactorialRecurison {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(test(n));
    }
    public static int test(int n ){
        if(n==1){
            return 1;
        }
        return n*test(n-1);
    }
}


// 5*4*3*2*1 = 120

//Another way
/*
int product =1
for(int i =0;i<n;i++){
    product=*i;
    print(product)
        }

 */