package Functional_programingDay13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map_method {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ramesh");
        al.add("suresh");
        al.add("mukesh");
        al.add("ajay");
        System.out.println(al);
        Stream<String> ss=al.stream();
//List list=ss.map(s->{return "welcome "+s;}).collect(Collectors.toList());
//or without using return keyword
        List list=ss.map(s-> "welcome "+s.toUpperCase()).collect(Collectors.toList());  // all upper case
        list.stream().forEach(s->System.out.println(s));

    }

}
