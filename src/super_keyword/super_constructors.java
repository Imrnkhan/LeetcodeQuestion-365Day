package super_keyword;

//public class super_constructors {
//}
class Students{
      Students(){

        System.out.println("student class constructor");
    }
}
class teacher extends Students{
    teacher() {
        super();
        System.out.println("teacher class constructor");
    }
}
class testA{
    public static void main(String[] args) {
        teacher t1 = new teacher();
//        student s1 = new student();

    }

}

