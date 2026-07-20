package RepeatProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheFrequencyOfElement {
    public static void main(String[] args) {
        List<String> listOfString= Arrays.asList("java","spring","java","spring","c","c++");
        Map<String,Long> countOfElement=listOfString.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countOfElement);
    }
}
