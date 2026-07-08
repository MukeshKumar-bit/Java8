package java8;

import java.util.Arrays;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> oddNumber = list.stream().filter(e -> e % 2 != 0).toList();
        System.out.println(oddNumber);
    }
}
