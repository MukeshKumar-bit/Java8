package RepeatProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumAndMinimumOfThoseNumbers {
    public static void main(String[] args) {
        List<Integer> listOfInteger= Arrays.asList(45,12,56,15,24);
        int maxElement=listOfInteger.stream().max(Comparator.naturalOrder()).get();
        System.out.println(maxElement);
        int minElement=listOfInteger.stream().min(Comparator.naturalOrder()).get();
        System.out.println(minElement);
    }
}
