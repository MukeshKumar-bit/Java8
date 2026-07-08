package java8;

//find the second-highest number in the given list



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program5 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,34,65,87,67);
        java.lang.Integer secondHighestNumber =list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighestNumber);
    }
}
