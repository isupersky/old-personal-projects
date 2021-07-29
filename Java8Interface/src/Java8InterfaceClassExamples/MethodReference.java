package Java8InterfaceClassExamples;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> studentList = Arrays.asList("Zaid","Java8InterfaceExamples.Aakash", "Aayuish", "Shivani", "Shubham");

//        Version 4
        studentList.sort(String::compareTo);

//        Version 3
//        studentList.sort(( s, t1)-> s.compareTo(t1));

//        Version 2
//        studentList.sort(( s, t1)-> {
//            return s.compareTo(t1);
//
//        });

//        Version 1
//        studentList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s, String t1) {
//                return s.compareTo(t1);
//            }
//        });

        studentList.forEach(System.out::println);
    }
}
