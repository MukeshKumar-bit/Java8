package InterviewQuestion;

import java.util.Arrays;
import java.util.List;

public class removeTheDuplicateElement {
    public static void main(String[] args) {
        //Remove the duplicate elemnt given list
        List<Integer> listOfInteger= Arrays.asList(1,2,3,4,3,2,5,6,7);
        List<Integer> removeDuplicate =listOfInteger.stream().distinct().toList();
        System.out.println(removeDuplicate);
        //remove the duplicate String in the given list
        

    }
}
