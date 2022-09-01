package super_keyword;

//public class super_varible {
//}

class vechile{
    int getSpeed = 145;
    int speed =120;

}

class car extends vechile{
    int maxspeed =180;
    void display(){
        System.out.println("running speed "+super.speed);
    }
}
class test{
    public static void main(String[] args) {
        car v = new car();
        v.display();


    }
}