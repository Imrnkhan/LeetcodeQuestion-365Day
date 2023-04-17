package upcasting_downcasting;

class test{                               ///parent class
    void run(){
        System.out.println(" parent  method running");
    }
}
class chid extends test{                    //child class
    void run(){
        System.out.println(" child class running ");
    }
    public static void main(String args[]){
        test b = new chid();//upcasting
        b.run(); //
    }
}

/*
class A{ //Parent class
--
}
class B extends A{ //Child class
--
}
A a=new B();//upcasting, this is only possible if B class is a child class of A
 */