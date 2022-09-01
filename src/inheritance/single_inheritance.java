package inheritance;
//
//public class single_inheritance {
//
////}
//class Animal{
//    void eat(){
//        System.out.println("eating...");
//    }
//}
//class Dog extends Animal{
//    void bark(){
//        System.out.println("barking...");
//    }
//}
//class Main{
//    public static void main(String args[]){
//        Dog d=new Dog();
//        d.bark();
//        d.eat();
//    }
//}


class animal{
    void food(){
        System.out.println("eating food...");
    }
}
class dog extends animal{
    void barking(){
        System.out.println("dog barking ....");
    }
}
class main{

    public static void main(String[] args) {
        dog d = new dog();
        d.barking();
        d.food();
        System.out.println("mian method..");
}

    }