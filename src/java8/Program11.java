package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program11 {
    public static void main(String[] args) {

        String inputString = "java concept of the day";

        String firstRepeated = Arrays.stream(inputString.replace(" ", "").split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("No repeated character");

        System.out.println(firstRepeated);
    }
}