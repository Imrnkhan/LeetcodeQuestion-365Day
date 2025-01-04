package evl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(9, 5, 3, 7, 2);
//        List<Integer> evenNumbers = numbers.stream().distinct()
//                .filter(num -> num % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(evenNumbers);
        List<String> names = Arrays.asList("John", "Jane", "Max");
//        names.forEach(System.out::println);
          names.forEach(name-> System.out.println(name+" "));
    }


//    public class SortStringsByLengthJava8 {
//        public static void main(String[] args) {
//            List<String> languages = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

            // Sort by string length using lambda expression
//            languages.sort(Comparator.comparingInt(String::length));
//            languages.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

            // Print the sorted list
//            languages.forEach(System.out::println); // Method reference to print each element
//        }
    }



//








/*
    sorted array of integers
       [11,11,11,22,33,33,33]
        N=33
        o/p
        [start index, end index]
        [4,6]
        N=22
        [3,3]
        N=77
        o/p
        [-1,-1]

 */