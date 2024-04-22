package Encapsulation;

 public class student3 {
  private String name;

  public String getName() {
   return name;
  }

  public void setName(String name) {
   this.name = name;
  }
 }
class test{
 public static void main(String[] args) {
  student3 demo = new student3();
  demo.setName("vijay");
  System.out.println(demo.getName());
 }
}

//use of getter and setter method