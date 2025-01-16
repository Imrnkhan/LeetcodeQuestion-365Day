package interface_java;

interface  InterfaceExp {
     void test();
}
class nextInter implements InterfaceExp{

    @Override
    public void test() {
        System.out.println("this is interface");
    }

    public static void main(String[] args) {
         InterfaceExp hs = new nextInter();
         hs.test();
    }
}

//the main diff bw both abstract use extend and interface use implement