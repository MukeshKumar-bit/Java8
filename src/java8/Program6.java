package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//count the number of element in the list
public class Program6 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("java","c++","java","Spring");
        java.util.Map<String,Long> count=list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(count);
    }
}
