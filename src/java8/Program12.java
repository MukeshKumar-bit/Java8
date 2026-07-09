package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//first non-repeated character in a string?
public class Program12 {
    public static void main(String[] args) {
        String inputString="Java Concept of the day";
        java.util.Map<String,Long> count =Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
    String s=count.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get();
        System.out.println(s);
    }
}
