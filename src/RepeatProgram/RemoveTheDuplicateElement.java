package RepeatProgram;

import java.util.Arrays;
import java.util.List;

public class RemoveTheDuplicateElement {
    public static void main(String[] args) {
        //Remove the duplicate element in the given List
        List<Integer> listOfInteger=Arrays.asList(1,2,3,4,3,2);
        List<Integer> removeDuplicate =listOfInteger.stream().distinct().toList();
        System.out.println(removeDuplicate);
    }


}
