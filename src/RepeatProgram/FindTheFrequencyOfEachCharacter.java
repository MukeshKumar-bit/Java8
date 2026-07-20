package RepeatProgram;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheFrequencyOfEachCharacter {
    public static void main(String[] args) {
        String s="concept of the day";
        Map<Character,Long> countElement=s.chars().mapToObj(c->(char)c).collect((Collectors.groupingBy(Function.identity(),Collectors.counting())));
        System.out.println(countElement);
    }
}
