package InterviewQuestionAndAnswer;

import java.util.Arrays;
import java.util.List;

public class HowToRemoveTheDuplicateElement {
    public static void main(String[] args) {
        List<Integer> listOfInteger= Arrays.asList(1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1);
        List<Integer> removeTheDuplicateElement =listOfInteger.stream().distinct().toList();
        System.out.println(removeTheDuplicateElement);
        System.out.println("---------------------------------------------------------------");
        List<String> listOfString=Arrays.asList("java","springBoot","c++","java","springboot");
        List<String> removeTheStringValue=listOfString.stream().distinct().toList();
        System.out.println(listOfString);
        System.out.println("-----------------------------------------------------------------");
    }
}
