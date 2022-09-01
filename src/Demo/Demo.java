package Demo;

public class Demo {
    void fun1(A a1){ //never use such identifiers
        if(a1 != null){
            System.out.println("inside fun1 of Demo");
            System.out.println("the value of a1 is : "+a1);
            a1.funA();
        }else
            System.out.println("supplied value is null");
    }
    public static void main(String[] args)
    {
        Demo d1=new Demo();
        d1.fun1(new A());
        d1.fun1(null);
    }
}