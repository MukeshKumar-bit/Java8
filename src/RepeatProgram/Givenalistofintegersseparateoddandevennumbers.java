package RepeatProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Givenalistofintegersseparateoddandevennumbers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers= Arrays.asList(89,88,90,44,55,77,12,70);
        java.util.Map <Boolean,List<Integer>> eveneNumberOrOddNumber=listOfIntegers.stream().collect(Collectors.partitioningBy(e->e%2==0));
        System.out.println(eveneNumberOrOddNumber);
    }
}
