package RepeatProgram;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheElement {
    public static void main(String[] args) {
        List<String> listOfTheElement= Arrays.asList("mukesh","kumar","kumar","pandey","saket","kumar");
        Map<String, Long> count=listOfTheElement.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count);


    }
}
