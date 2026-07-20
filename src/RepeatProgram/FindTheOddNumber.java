package RepeatProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheOddNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        java.util.List<Integer> oddNumber =list.stream().filter(e->e%2!=0).collect(Collectors.toList());
        System.out.println(oddNumber);
    }
}
