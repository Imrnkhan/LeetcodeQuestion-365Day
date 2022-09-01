package collection_framework_Day11;

import java.util.Comparator;

public class Student1 implements Comparator<Student1>{

        private int roll;
        private String name;
        private int mark;

    public Student1() {
        }

    public Student1( int roll, String name,int mark){
            this.roll = roll;
            this.name = name;
            this.mark = mark;
        }

        public int getRoll () {
            return roll;
        }

        public void setRoll ( int roll){
            this.roll = roll;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getMark () {
            return mark;
        }

        public void setMark ( int mark){
            this.mark = mark;
        }

        @Override
        public String toString () {
            return "Student1{" +
                    "roll=" + roll +
                    ", name='" + name + '\'' +
                    ", mark=" + mark +
                    '}';

        }

    @Override
    public int compare(Student1 s1, Student1 s2) {

//        return s1.getMark()> s2.getMark()?+1:-1;    // sort by mark


        if(s1.getRoll()> s2.getRoll())
            return +1;
        else if (s1.getRoll()< s2.getRoll())   //sort by rollno
            return -1;
        else return 0;

//return s1.getName().compareTo(s2.getName());   //name comapere

//        if(s1.getMark()>s2.getMark())
//            return +1;
//        else if (s1.getMark()< s2.getMark())  //name and mark sorting
//            return -1;
//        else
//            return s1.getName().compareTo(s2.getName());
//


    }
}



