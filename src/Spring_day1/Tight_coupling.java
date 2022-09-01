package Spring_day1;
//
//public class loose_coupling {
//    public void funA(){
//        System.out.println("inside funA on A");
//    }
//    class B{
//
//    public void funB(){
//        System.out.println("inside funB on B");
//    }
//
//    }
//    public static void main(String[] args) {
//       loose_coupling lb = new loose_coupling();
//       lb.funA();
//    }
//}


class B{
    public void funB(){
        System.out.println("inside funB of B");
    }
}
class A { // Dependent

    public void funA(){
        System.out.println("inside funA of A");
    }

    public static void main(String[] args) {

        B b1 = new B(); //dependency
        b1.funB();

//        get funA
//        A a1 = new A();
//        a1.funA();
    }
}

