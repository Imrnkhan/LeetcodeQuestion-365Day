package Zap;

abstract class Prime {
     abstract void eat();

    }
    class doh extends Prime{

        @Override
        void eat() {

            System.out.println("heelo");
        }

        public static void main(String[] args) {
            Prime hs = new doh();
            hs.eat();
        }
    }





