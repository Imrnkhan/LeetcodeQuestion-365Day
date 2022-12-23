package super_keyword;


class person{
  void  message(){
        System.out.println("person class ");

    }
}
class student extends person{
   void  message(){
        System.out.println("student class");

    }
    void display() {
        System.out.println("display");
        message();
        super.message();
    }
    }
    class tests{
        public static void main(String[] args) {
            student s1 = new student();
            s1.display();

        }


}