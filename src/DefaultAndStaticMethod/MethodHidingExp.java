package DefaultAndStaticMethod;

 class MethodHidingExp {
     public static void test(){
         System.out.println("Inside foo method in parent class");
     }
 public void bar(){
     System.out.println("Inside bar method in parent class");
 }

 }

class child extends MethodHidingExp{
     public static void test(){
         System.out.println("Inside foo method in child class");
     }

    // Overriding
    public void bar() {
        System.out.println("Inside bar method in child class");
    }

    public static void main(String[] args) {
        MethodHidingExp p = new MethodHidingExp();
        MethodHidingExp c = new child();
        System.out.println("****************Method Hiding*******************");
        p.test(); // This will call method in parent class
        c.test(); // This will call method in parent class
        System.out.println("****************Method overriding*******************");
        p.bar(); // This will call method in parent class
        c.bar(); // This will call method in child class

    }

}
