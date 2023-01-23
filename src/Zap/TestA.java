package Zap;



public class TestA {
    private String name;

    public String getName(){
        return name;
    }
public void setName(String name){
        this.name = name;
}

    public static void main(String[] args) {
        TestA hs = new TestA();
        hs.setName("vijay");
        System.out.println(hs.getName());
    }
 }
