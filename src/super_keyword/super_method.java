package super_keyword;


//class person{
//  void  message(){
//        System.out.println("person class ");
//
//    }
//}
//class student extends person{
//   void  message(){
//        System.out.println("student class");
//
//    }
//    void display() {
//        System.out.println("display");
//        message();
//        super.message();
//    }
//    }
//    class tests{
//        public static void main(String[] args) {
//            student s1 = new student();
//            s1.display();
//
//        }
//}

class Parentclass {
    //Overridden method
    void display(){
        System.out.println("This is Parent class method");
    }
}
class Subclass extends Parentclass {
    //Overriding method
    void display(){
        System.out.println("This is Child class method");
    }
    void printMsg(){
//This would call Overriding method
        display();
//This would call Overridden method
        super.display();
    }
    public static void main(String args[]){
        Subclass obj= new Subclass();
        obj.printMsg();
    }
}