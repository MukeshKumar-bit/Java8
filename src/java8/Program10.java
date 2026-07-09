package java8;

import java.util.Arrays;
import java.util.List;

//How do you get three maximum number and three minimum numbers from the given list of integers.
public class Program10 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(45,12,56,15,24,75,31,89);
        list.stream().sorted().limit(3).forEach(System.out::println);

    }
}
