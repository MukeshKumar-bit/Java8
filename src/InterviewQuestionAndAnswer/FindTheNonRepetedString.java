package InterviewQuestionAndAnswer;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheNonRepetedString {
    public static void main(String[] args) {
        String str="swiss";
        LinkedHashMap<String,Long> countElement=Arrays.stream(str.split("")).collect((Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())));
        System.out.println(countElement);

        String nonRepeating=countElement.entrySet().stream().filter(e->e.getValue()==1).map(s->s.getKey()).findFirst().get();
        System.out.println(nonRepeating);

    }
}
