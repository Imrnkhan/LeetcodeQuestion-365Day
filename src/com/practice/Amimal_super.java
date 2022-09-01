package com.practice;

class Amimal_super {
    void eat() {

        System.out.println("eating....");
    }
}
class cats extends Amimal_super {
    void bark() {
        System.out.println("barking....");
    }

    void work() {
        super.eat();
        bark();
    }
}
    class maind{
        public static void main(String[] args) {
            cats c = new cats();
            c.work();
        }
    }
