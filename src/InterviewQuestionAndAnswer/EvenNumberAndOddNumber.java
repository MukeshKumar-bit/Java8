package InterviewQuestionAndAnswer;

import java.util.Arrays;
import java.util.List;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Map;

public class EvenNumberAndOddNumber
{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> evenNumber =list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(evenNumber);
        System.out.println("-----------------------------------------------------------------------");
        List<Integer> oddNumber =list.stream().filter(a->a%2!=0).collect(Collectors.toList());
        System.out.println(oddNumber);
        System.out.println("------------------------------------------------------------------------");
        Map<Boolean,List<Integer>> evenNumberAndOddNumber =list.stream().collect(Collectors.partitioningBy(e->e%2==0));
        System.out.println(evenNumber);
        System.out.println("------------------------------------------------------------------------");
        Predicate<Integer> p=e->e%2==0;
        List<Integer> even=list.stream().filter(p).collect(Collectors.toList());
        System.out.println(even);
        System.out.println("-------------------------------------------------------------------------");

    }
}
