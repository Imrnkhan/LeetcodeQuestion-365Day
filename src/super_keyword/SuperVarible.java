package super_keyword;




public class SuperVarible {
    int max = 110;
}
class child extends SuperVarible{
    int max = 190;
    void disp(){
        System.out.println(super.max);
    }
}
class main{
    public static void main(String[] args) {
        child hs = new child();
        hs.disp();
    }
}





