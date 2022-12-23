package super_keyword;



class vechile{
    int getSpeed = 145;
    int speed =120;

}

class car extends vechile{
    int maxspeed =180;
    void display(){
        System.out.println(speed);
        System.out.println("running speed "+super.speed);
    }
}
class test{
    public static void main(String[] args) {
        car v = new car();
        v.display();


    }
}