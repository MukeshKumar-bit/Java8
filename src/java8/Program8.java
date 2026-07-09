package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How do you find the frequency of each element in an array or a list
public class Program8 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("java","c++","java","c");
        java.util.Map<String,Long> count=list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(count);
    }
}
