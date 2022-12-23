package inheritance;

public class multilevel_inheritence {
    void eat(){
        System.out.println("eating the food");
    }
}
class secoter extends multilevel_inheritence{
    void run(){
        System.out.println("running bike");
    }

}
class car extends secoter{
    void runn(){
        System.out.println("secoter is runing");
    }

}
class demo{
    public static void main(String[] args) {
        car dc = new car();
        dc.eat();
        dc.run();
        dc.runn();
    }
}



