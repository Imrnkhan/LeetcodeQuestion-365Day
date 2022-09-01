package com.practice;

public class this_keyword {  //this keyword point on the current class object
int x = 100;

void fun(){
    int x = 500;
    System.out.println(x);
    System.out.println(this.x);

}

    public static void main(String[] args) {
this_keyword ks = new this_keyword();
       ks.fun();
//        System.out.println();
    }

}
