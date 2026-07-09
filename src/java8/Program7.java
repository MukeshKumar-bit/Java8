package java8;

import java.lang.management.ManagementPermission;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How do you find the frequency of each charcater in a string using java 8 stream api?
public class Program7 {
    public static void main(String[] args) {
        String inputString="java Concept of the day";
       java.util.Map<Character,Long> frequencyOfTheElement= inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(frequencyOfTheElement);
    }
}
