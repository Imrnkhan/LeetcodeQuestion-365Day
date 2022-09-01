package Functional_programingDay13;

public interface Itr {
    void sayHello(String name);   // absrtact method

    boolean equals(Object obj);   //  object class method

    default void fun1(){  // default method
        System.out.println("default method ...");
    }
    static void fun2(){   // static method
        System.out.println("static method...");
    }


    class X implements Itr{

        @Override
        public void sayHello(String name) {
            System.out.println("welcome: " + name);
        }
    }

    public static void main(String[] args) {
        Itr rs = new X();
        rs.sayHello("admin");
        rs.fun1();
        Itr.fun2();
    }
}
