package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Give a list of integers, find maximum and min number in the given list
public class Program9 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(45,12,56,15,24,75);
        int max=list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        int min=list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);
    }
}
