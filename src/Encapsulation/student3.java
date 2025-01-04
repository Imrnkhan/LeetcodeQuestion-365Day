package Encapsulation;

 public class student3 {
  private String name;
  private int age;

  public String getName() {
   return name;
  }

  public int getAge(){
   return age;
  }
  public void setName(String name) {
   this.name = name;
  }
  public void setAge(int age){
   this.age = age;
  }
 }
class test{
 public static void main(String[] args) {
  student3 demo = new student3();
  demo.setName("vijay");
  demo.setAge(12);
  System.out.println(demo.getAge());
  System.out.println(demo.getName());
 }
}

//use of getter and setter method