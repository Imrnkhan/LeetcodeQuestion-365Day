package inheritance;

public class hierarchicals {
     void run(){
         System.out.println("runing method");
     }
}
 class old extends hierarchicals{
    void display(){
        System.out.println("display method");
    }
 }
 class oldest extends hierarchicals{
    void disp(){
        System.out.println("displat2nd method");
    }
 }
 class Demo{
     public static void main(String[] args) {
         oldest ds = new oldest();
         ds.disp();
         ds.run();
//         ds.display();


     }
 }