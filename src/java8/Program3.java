package java8;

import java.util.Arrays;
import java.util.List;

//remove the duplicate element from given list.
public class Program3 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,2,4,34,5,6,7,8,7,9);
        java.util.List<Integer> removeTheDuplicate =list.stream().distinct().toList();
        System.out.println(removeTheDuplicate);
    }
}
