package java8;

import java.util.Arrays;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        java.util.List<Integer> evenNumber =list.stream().filter(e->e%2==0).toList();
        System.out.println(evenNumber);
    }
}
