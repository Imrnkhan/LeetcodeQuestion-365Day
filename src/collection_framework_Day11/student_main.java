package collection_framework_Day11;

import java.util.*;

public class student_main{
    public static void main(String[] args) {

        List<Student1> ts = new ArrayList<>();

        ts.add(new Student1(20,"Amit kumar",520));
        ts.add(new Student1(22,"Ankit",510));
        ts.add(new Student1(25,"Arjun",500));
        ts.add(new Student1(26,"rahul",530));
        ts.add(new Student1(23,"salim",528));
//        Collections.sort(ts,(s1,s2)-> s1.getMark()> s2.getMark()?+1:-1);
        Collections.sort(ts,new Student1());


        System.out.println(ts);

    }
}
