package DefaultAndStaticMethod;

public class DemoMainClass {
    public static void main(String[] args) {
        Developer hs = new AndriodDeveloper();    // yeh this method acces on andriod developer

        hs.test();
        hs.develop();


        Developer hd = new IosDeveloper();       // this access on iosdeveloper method
        hd.develop();
        hd.test();


        Developer hm = new WebDeveloper();        // this is access on webdeveloper method
        hm.test();
        hm.develop();


    }
}



//Question yeh hi jab ham interface use krte hi or inside interface weh absrct method hota or
//jab bhi ham interface ko implement krte hi to weh @override krta hi
// or jab ham default keyword use krte hi to ham ko saare chid class on change krne ki jarurat nhi hi ha us ko
// parent class mai hi defult  keyword use krki acces kr sak te hi or weh saare child class mai chala jayega
//and static method ko ham override nhi kr sak hi-
// interface can have methods with the following approaches:
//1 Abstract Methods (Traditional Approach): In versions of Java prior to Java 8, an interface could only contain abstract method declarations (methods without a body). Classes implementing the interface would need to provide implementations for these methods.
//
//Example:
//interface MyInterface {
//    void myMethod();
//}

//2. Default Methods
//interface MyInterface {
//    void myMethod();  // Abstract method
//
//    default void myDefaultMethod() {
//        System.out.println("Default implementation.");
//    }
//}

//3.Static Methods

//interface MyInterface {
//    void myMethod();  // Abstract method
//
//    static void myStaticMethod() {
//        System.out.println("Static method.");
//    }
//}
