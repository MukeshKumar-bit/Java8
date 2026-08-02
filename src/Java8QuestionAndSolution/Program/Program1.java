package Java8QuestionAndSolution.Program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, find out all the even numbers exist in the list using Stream functions?
public class Program1 {
    public static void main(String[] args) {
        List<Integer> listOfdInteger= Arrays.asList(1,2,3,4,5,6,7,8,9);
       List<Integer> evenNumber = listOfdInteger.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println();
    }
}
