package com.practice;

 class Student {
     int rollno;
     String name;
     String city;

     @Override
     public String toString() {
         return rollno+" "+name+" "+city;
     }

     public static void main(String[] args) {
         Student s1 = new Student(101,"delhi","khan");
         Student s2 = new Student(119,"gurgaon","anil");

         System.out.println(s1);
         System.out.println(s2);
     }
     Student(int rollno, String name, String city){
         this.rollno= rollno;
         this.name =name;
         this.city=city;

     }
}
