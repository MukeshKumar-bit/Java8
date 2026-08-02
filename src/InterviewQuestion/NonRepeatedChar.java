package InterviewQuestion;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedChar {
    public static void main(String[] args) {
        String str="swiss";
        java.util.LinkedHashMap<String,Long> countElement =Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        System.out.println(countElement);

        java.lang.String s =countElement.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get();

        System.out.println(s);

    }
}
