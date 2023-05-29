package collection_framework_Day11;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    class comprator {
        private String name;
        private int age;

        public comprator(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    class AgeComparator implements Comparator<comprator> {
        @Override
        public int compare(comprator s1, comprator s2) {
            return s1.getAge() - s2.getAge();
        }
    }

    public class Main {
        public static void main(String[] args) {
            List<comprator> students = new ArrayList<>();
            students.add(new comprator("John", 20));
            students.add(new comprator("Alice", 18));
            students.add(new comprator("Bob", 22));

            // Sorting the students based on age using the AgeComparator
            Collections.sort(students, new AgeComparator());

            // Printing the sorted students
            for (comprator student : students) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
            }
        }
    }


