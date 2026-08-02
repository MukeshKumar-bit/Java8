package InterviewQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindThenthNuber {
    public static void main(String[] args) {
        //Find the nth number in the given number
        List<Integer> listOfInteger= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer nthNumber =listOfInteger.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(nthNumber);

        //Find the evenNumber in the given number
        List<Integer> eveNumber=listOfInteger.stream().distinct().filter(e->e%2==0).toList();
        System.out.println(eveNumber);

        //Find the oddNumber in the given number
        listOfInteger.stream().distinct().filter(e->e%2!=2).toList().forEach(System.out::print);


    }
}
