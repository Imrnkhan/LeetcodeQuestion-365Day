package interface_java;

 interface Multiple_Inheritance_Inter1 {
      void eat();
}
interface Multiple_Inheritance_Inter2{
     void drink();
}

class nextInheritance implements Multiple_Inheritance_Inter1,Multiple_Inheritance_Inter2{

    @Override
    public void eat() {
        System.out.println("this is the eat method");
    }

    @Override
    public void drink() {
        System.out.println("this is the drink method");
    }

    public static void main(String[] args) {
        nextInheritance hs = new nextInheritance();
        hs.eat();
        hs.drink();
    }
}