package InterviewQuestionAndAnswer;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class HowToFindTheCountOfElement {
    public static void main(String[] args) {
        String str= "concept of day";
        Map<Character,Long> countOfWord=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countOfWord);
    }
}
